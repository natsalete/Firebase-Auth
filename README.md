<details>
<summary>🇧🇷 Versão em Português</summary>

# Firebase Authentication App

![Android](https://img.shields.io/badge/Platform-Android-green.svg)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple.svg)
![Firebase](https://img.shields.io/badge/Backend-Firebase-orange.svg)
![Material Design](https://img.shields.io/badge/Design-Material%20Design-blue.svg)
![API Level](https://img.shields.io/badge/API%20Level-21+-red.svg)

Um aplicativo Android moderno que implementa um sistema completo de autenticação de usuários utilizando Firebase Authentication. O app suporta registro e login com email/senha, além de login com Google, seguindo as melhores práticas de desenvolvimento Android.

## ✨ Funcionalidades

- **📧 Autenticação com Email/Senha**: Registro e login tradicional
- **🔐 Login com Google**: Integração com Google Sign-In
- **👤 Gerenciamento de Usuário**: Exibição de informações do usuário
- **🔒 Sessão Persistente**: Mantém o usuário logado entre sessões
- **📱 Interface Moderna**: Design seguindo Material Design Guidelines
- **⚡ Feedback em Tempo Real**: Validação de formulários e mensagens de erro
- **📨 Verificação de Email**: Envio automático de email de verificação

## 🛠️ Tecnologias Utilizadas

- **Kotlin** - Linguagem de programação principal
- **Android SDK** - Framework de desenvolvimento Android
- **Firebase Authentication** - Serviço de autenticação
- **Firebase Analytics** - Análise de uso do app
- **Google Play Services** - Para login com Google
- **Material Design Components** - Componentes de UI modernos
- **View Binding** - Binding seguro de views
- **Vector Drawables** - Ícones vetoriais escalonáveis

## 📋 Pré-requisitos

- Android Studio Arctic Fox ou superior
- JDK 8 ou superior
- Android API Level 21 (Android 5.0) ou superior
- Conta no Firebase Console
- Conta no Google Cloud Console (para login com Google)

## 🚀 Configuração do Projeto

### 1. Clonar o Repositório
```bash
git clone https://github.com/natsalete/Firebase-Auth.git
cd firebase-auth-app
```

### 2. Configurar Firebase

1. Acesse o [Firebase Console](https://console.firebase.google.com/)
2. Crie um novo projeto ou selecione um existente
3. Adicione um app Android ao projeto
4. Registre o app com o package name: `com.example.firebaseauth`
5. Baixe o arquivo `google-services.json`
6. Coloque o arquivo na pasta `app/` do projeto

### 3. Habilitar Métodos de Autenticação

No Firebase Console:
1. Vá para **Authentication** > **Sign-in method**
2. Habilite **Email/Password**
3. Habilite **Google** (configure o support email)

### 4. Configurar Google Sign-In

1. No [Google Cloud Console](https://console.cloud.google.com/):
   - Vá para **APIs & Services** > **Credentials**
   - Crie credenciais OAuth 2.0 para Android
   - Use o SHA-1 do seu keystore de debug

2. Para obter o SHA-1 de debug:
```bash
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
```

## 🔧 Instalação

1. Abra o projeto no Android Studio
2. Sync o projeto com Gradle Files
3. Configure o arquivo `google-services.json` (veja seção de configuração)
4. Execute o app no emulador ou dispositivo físico

## 🎯 Como Usar

### Primeiro Uso
1. Execute o aplicativo
2. Tela de login será exibida
3. Toque em "Cadastre-se" para criar uma nova conta
4. Preencha email e senha (mínimo 6 caracteres)
5. Confirme a senha
6. Toque em "Criar Conta"

### Login
1. Na tela de login, insira email e senha
2. Toque em "Entrar" ou
3. Use "Entrar com Google" para login social

### Tela Principal
- Exibe informações do usuário logado
- Mostra status de verificação do email
- Botão de logout disponível

## 🛡️ Segurança

- **Validação de Entrada**: Todos os campos são validados
- **Senhas Seguras**: Mínimo de 6 caracteres obrigatório
- **Autenticação Firebase**: Gerenciamento seguro de credenciais
- **Verificação de Email**: Confirmação de email opcional
- **Logout Completo**: Limpa sessões do Firebase e Google

## 🎨 Design

O aplicativo segue as diretrizes do Material Design:
- **Cores Consistentes**: Paleta de cores harmoniosa
- **Typography**: Hierarquia visual clara
- **Componentes**: TextInputLayout, MaterialButton, MaterialCardView
- **Ícones**: Vector drawables adaptativos
- **Feedback Visual**: Estados de loading e erro

## 📱 Capturas de Tela

<div align="center">
<img src="https://github.com/user-attachments/assets/782ad64f-d930-46fc-aa8d-a3a583ea6d07" width="250" />
<img src="https://github.com/user-attachments/assets/c2daa6f7-9433-446f-b1ec-2440083d8bf8" width="250" />
<img src="https://github.com/user-attachments/assets/bdf659e1-8cab-4a59-8bff-a9fad9d75567" width="250" />
</div>

## 🚀 Funcionalidades Futuras

- [ ] Reset de senha
- [ ] Login com Facebook
- [ ] Perfil de usuário editável
- [ ] Tema escuro
- [ ] Biometria
- [ ] Multi-idiomas

## 🤝 Contribuindo

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para detalhes.

## 👨‍💻 Autor

**Seu Nome**
- GitHub: [@natsalete](https://github.com/natsalete)
- LinkedIn: [Natalia Salete](https://www.linkedin.com/in/natalia-salete-rodrigues/)
- Email: natsalete20@gmail.com

## 🙏 Agradecimentos

- Firebase Team pelo excelente serviço de autenticação
- Material Design Team pelas diretrizes de UI
- Android Developers Community
  
---

⭐ Se este projeto foi útil, considere dar uma star no repositório!

## 📚 Recursos Adicionais

- [Documentação Firebase Auth](https://firebase.google.com/docs/auth)
- [Material Design Guidelines](https://material.io/design)
- [Android Developer Guides](https://developer.android.com/guide)

</details>

# Firebase Authentication App

![Android](https://img.shields.io/badge/Platform-Android-green.svg)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple.svg)
![Firebase](https://img.shields.io/badge/Backend-Firebase-orange.svg)
![Material Design](https://img.shields.io/badge/Design-Material%20Design-blue.svg)
![API Level](https://img.shields.io/badge/API%20Level-21+-red.svg)

A modern Android app that implements a complete user authentication system using Firebase Authentication. The app supports registration and login with email/password, as well as Google login, following Android development best practices.

## ✨ Features

- **📧 Email/Password Authentication**: Traditional registration and login
- **🔐 Google Login**: Integration with Google Sign-In
- **👤 User Management**: Display user information
- **🔒 Persistent Session**: Keeps the user logged in between sessions
- **📱 Modern Interface**: Design following Material Design Guidelines
- **⚡ Real-Time Feedback**: Form validation and error messages
- **📨 Email Verification**: Automatically sends verification emails

## 🛠️ Technologies Used

- **Kotlin** - Core programming language
- **Android SDK** - Android development framework
- **Firebase Authentication** - Authentication service
- **Firebase Analytics** - App usage analytics
- **Google Play Services** - For Google login
- **Material Design Components** - Modern UI components
- **View Binding** - Secure view binding
- **Vector Drawables** - Scalable vector icons

## 📋 Prerequisites

- Android Studio Arctic Fox or higher
- JDK 8 or higher
- Android API Level 21 (Android 5.0) or higher
- Firebase Console account
- Google Cloud Console account (for Google login)

## 🚀 Project Setup

### 1. Clone the Repository
```bash
git clone https://github.com/natsalete/Firebase-Auth.git
cd firebase-auth-app
```

### 2. Configure Firebase

1. Access the [Firebase Console](https://console.firebase.google.com/)
2. Create a new project or select an existing one
3. Add an Android app to the project
4. Register the app with the package name: `com.example.firebaseauth`
5. Download the file `google-services.json`
6. Place the file in the project's `app/` folder

### 3. Enable Authentication Methods

In the Firebase Console:
1. Go to **Authentication** > **Sign-in method**
2. Enable **Email/Password**
3. Enable **Google** (configure the email support)

### 4. Configure Google Sign-In

1. In the [Google Cloud Console](https://console.cloud.google.com/):
- Go to **APIs & Services** > **Credentials**
- Create OAuth 2.0 credentials for Android
- Use the SHA-1 from your debug keystore

2. To get the debug SHA-1:
```bash
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
```

## 🔧 Installation

1. Open the project in Android Studio
2. Sync the project with Gradle Files
3. Configure the `google-services.json` file (see configuration section)
4. Run the app on the emulator or physical device

## 🎯 How to Use

### First Time
1. Run the app
2. The login screen will appear
3. Tap "Sign Up" to create a new account
4. Enter your email address and password (minimum 6 characters)
5. Confirm your password
6. Tap "Create Account"

### Login
1. On the login screen, enter your email address and password
2. Tap "Sign In" or
3. Use "Sign In with Google" for social login

### Main Screen
- Displays logged-in user information
- Shows email verification status
- Logout button available

## 🛡️ Security

- **Input Validation**: All fields are validated
- **Secure Passwords**: Minimum 6 characters required
- **Firebase Authentication**: Secure credential management
- **Email Verification**: Optional email confirmation
- **Full Logout**: Clears Firebase and Google sessions

## 🎨 Design

The app follows Material Design guidelines:
- **Consistent Colors**: Harmonious color palette
- **Typography**: Clear visual hierarchy
- **Components**: TextInputLayout, MaterialButton, MaterialCardView
- **Icons**: Adaptive vector drawables
- **Visual Feedback**: Loading and error states

## 📱 Screenshots

<div align="center">
<img src="https://github.com/user-attachments/assets/782ad64f-d930-46fc-aa8d-a3a583ea6d07" width="250" />
<img src="https://github.com/user-attachments/assets/c2daa6f7-9433-446f-b1ec-2440083d8bf8" width="250" />
<img src="https://github.com/user-attachments/assets/bdf659e1-8cab-4a59-8bff-a9fad9d75567" width="250" />
</div

## 🚀 Upcoming Features

- [ ] Password Reset
- [ ] Facebook Login
- [ ] User Profile Editable
- [ ] Dark Theme
- [ ] Biometrics
- [ ] Multi-Language

## 🤝 Contributing

1. Fork the project
2. Create a branch for your feature (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License. See the [LICENSE] file for details.

## 👨‍💻 Author

**Your Name**
- GitHub: [@natsalete](https://github.com/natsalete)
- LinkedIn: [Natalia Salete](https://www.linkedin.com/in/natalia-salete-rodrigues/)
- Email: natsalete20@gmail.com

## 🙏 Thanks

- Firebase Team for the excellent authentication service
- Material Design Team for the UI guidelines
- Android Developers Community

---

⭐ If this project was helpful, please consider giving the repository a star!

## 📚 Additional Resources

- [Firebase Auth Documentation](https://firebase.google.com/docs/auth)
- [Material Design Guidelines](https://material.io/design)
- [Android Developer Guides](https://developer.android.com/guide)

