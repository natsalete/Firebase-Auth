package com.example.firebaseauth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebaseauth.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Check if user is signed in
        val currentUser = auth.currentUser
        if (currentUser == null) {
            // User is not signed in, redirect to LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
            return
        }

        displayUserInfo()
        setupClickListeners()
    }

    private fun displayUserInfo() {
        val user = auth.currentUser
        user?.let {
            val email = it.email ?: "Email não disponível"
            val userId = it.uid
            val isEmailVerified = it.isEmailVerified

            binding.tvUserInfo.text = "Olá, ${email.substringBefore("@")}!"
            binding.tvEmail.text = "Email: $email"
            binding.tvUserId.text = "ID do Usuário: $userId"

            if (!isEmailVerified) {
                binding.tvUserInfo.text = "${binding.tvUserInfo.text}\n(Email não verificado)"
            }
        }
    }

    private fun setupClickListeners() {
        binding.btnLogout.setOnClickListener {
            logout()
        }
    }

    private fun logout() {
        // Sign out from Firebase
        auth.signOut()

        // Sign out from Google
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        val googleSignInClient = GoogleSignIn.getClient(this, gso)
        googleSignInClient.signOut().addOnCompleteListener(this) {
            Toast.makeText(this, "Logout realizado com sucesso!", Toast.LENGTH_SHORT).show()

            // Redirect to LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}