package com.example.firebaseauth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebaseauth.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth

    companion object {
        private const val TAG = "RegisterActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.btnRegister.setOnClickListener {
            registerUser()
        }

        binding.tvLogin.setOnClickListener {
            finish() // Go back to LoginActivity
        }
    }

    private fun registerUser() {
        val email = binding.etEmail.text.toString().trim()
        val password = binding.etPassword.text.toString().trim()
        val confirmPassword = binding.etConfirmPassword.text.toString().trim()

        if (!validateForm(email, password, confirmPassword)) {
            return
        }

        binding.btnRegister.isEnabled = false
        binding.btnRegister.text = "Criando conta..."

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                binding.btnRegister.isEnabled = true
                binding.btnRegister.text = getString(R.string.criar_conta)

                if (task.isSuccessful) {
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    Toast.makeText(
                        baseContext,
                        "Conta criada com sucesso!",
                        Toast.LENGTH_SHORT
                    ).show()

                    // Send email verification
                    user?.sendEmailVerification()
                        ?.addOnCompleteListener { verificationTask ->
                            if (verificationTask.isSuccessful) {
                                Toast.makeText(
                                    baseContext,
                                    "Email de verificação enviado!",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        }

                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    val errorMessage = when (task.exception?.message) {
                        "The email address is already in use by another account." -> "Este email já está em uso"
                        "The email address is badly formatted." -> "Email inválido"
                        "The given password is invalid. [ Password should be at least 6 characters ]" -> "A senha deve ter pelo menos 6 caracteres"
                        else -> "Falha no registro: ${task.exception?.message}"
                    }
                    Toast.makeText(baseContext, errorMessage, Toast.LENGTH_SHORT).show()
                }
            }
    }

    private fun validateForm(email: String, password: String, confirmPassword: String): Boolean {
        var isValid = true

        if (email.isEmpty()) {
            binding.etEmail.error = "Email é obrigatório"
            isValid = false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.etEmail.error = "Email inválido"
            isValid = false
        }

        if (password.isEmpty()) {
            binding.etPassword.error = "Senha é obrigatória"
            isValid = false
        } else if (password.length < 6) {
            binding.etPassword.error = "A senha deve ter pelo menos 6 caracteres"
            isValid = false
        }

        if (confirmPassword.isEmpty()) {
            binding.etConfirmPassword.error = "Confirmação de senha é obrigatória"
            isValid = false
        } else if (password != confirmPassword) {
            binding.etConfirmPassword.error = "As senhas não coincidem"
            isValid = false
        }

        return isValid
    }
}