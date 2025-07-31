# Authify-Backend
Authify Backend
A robust and secure authentication API built on Spring Boot. It's the core of any modern application, providing all the essential user management features you need.

📝 What it Does
This project is a complete backend solution for user authentication. It handles everything from creating new accounts to managing secure sessions, so you don't have to build it from scratch.

✨ Core Features
User Registration: A clean signup process that automatically sends a welcome email.

Secure Login: Users log in to receive a JWT (JSON Web Token) for authenticated access.

Email Verification: A confirmation flow that sends a One-Time Password (OTP) to securely activate a user's account.

Password Reset: A secure process using an OTP to verify a user's identity before they can set a new password.

Token-Based Authentication: All protected endpoints require a valid JWT, ensuring your APIs are secure.

User Logout: A simple endpoint to invalidate JWT tokens, providing a reliable logout mechanism.

🚀 Tech Stack
Backend: Spring Boot, Java

Security: Spring Security, JWT

Build: Maven

Database: MySQL

⚙️ Getting Started
Follow these steps to get a local copy running.

Clone the repository:

git clone https://github.com/Dattunaik5522/Authify-Backend.git
cd Authify-Backend

Configure application.properties:
Create src/main/resources/application.properties and add your database and email server credentials.

# Database Settings
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

# Email Settings
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your_email@example.com
spring.mail.password=your_email_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

server.port=8080

Run the application:
Use your IDE or the command line to start the application.

mvn spring-boot:run

🗺️ API Endpoints
Method

Endpoint

Description

POST

/api/auth/register

Create a new user account.

POST

/api/auth/login

Authenticate and get a JWT token.

GET

/api/auth/verify-email

Verify email with an OTP.

POST

/api/auth/forgot-password

Request an OTP for password reset.

POST

/api/auth/reset-password

Reset a user's password with an OTP.

POST

/api/auth/logout

Invalidate the user's token.

GET

/api/user/profile

Access the current user's profile (protected).

