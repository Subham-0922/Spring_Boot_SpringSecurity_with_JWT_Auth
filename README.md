# Spring_Boot_SpringSecurity_with_JWT_Auth
JWT Authentication is a backend project that focuses on implementing user authentication and authorization within the Spring Boot framework. The system exposes a RESTful API to handle user login and signup functionality, while incorporating robust security measures and JWT (JSON Web Tokens) for authentication.

Table of Contents
1. Features
2. Tech-Stack
3. Dependencies
4. Prerequisites
5. Setup & Installation
6. Access URLs

Features
1. User signup: Users can create new accounts by providing their personal details, including name, email, and password. The system securely stores this user information in the H2 database.

2. User login: Users can authenticate themselves by providing their credentials (email and password) through the login endpoint. Upon successful authentication, the system generates and returns a web token.

3. JWT-based authentication: The application utilizes JSON Web Tokens (JWT) for user authentication and authorization. To access protected resources, a valid JWT token is required, ensuring that only authenticated users can access them.

Tech-Stack
- JAVA
- SPRING
- SPRING BOOT
- MAVEN
- H2 DATABASE
- POSTMAN

Dependencies
- SPRING DATA JPA
- SPRING BOOT DEVTOOLS
- SPRING WEB
- SPRING SECURITY
- H2 DATABASE
- VALIDATION
- LOMBOK
- JWT API
- JWT IMPL
- JWT JACKSON

Prerequisites
Before running the application, ensure that you have the following installed:
- Java
- Java IDE (preferably Spring Tool Suite)

Setup & Installation
1. Install the Spring Tool Suite (STS) from https://spring.io/tools
2. Clone the Repository using the following command:
   ```
   git clone https://github.com/sahu-neha/Backend-Authentication-SpringBoot.git
   ```
3. Run Locally:
   - Open the "Backend_for_login_signup" folder with STS.
   - Go to "src/main/resources/application.properties" and update your SpringBoot username and password. By default, it uses "sa" as the username and an empty password for the in-memory store.
   - Change the server port by modifying "server.port=8080".
   - Go to "com.masai" package and run "BackendForLoginSignupApplication.java" as a Spring Boot App (Alt+Shift+X, B).

Access URLs
Use Postman to interact with the following API endpoints:

1. Home (Method: GET):
   ```
   http://localhost:8080/user
   ```

2. User Signup (Method: POST):
   ```
   http://localhost:8080/user/signup
   ```
   Request Body:
   ```
   {
     "firstName": "fName",
     "lastName": "lName",
     "email": "email@example.com",
     "password": "@password"
   }
   
3. Admin Signup (Method: POST):
   ```
   http://localhost:8080/user/signup/{secretKey}
   ```
   Replace {secretKey} with the actual secret key value in the URL.
   Request Body:
   ```
   {
     "firstName": "fName",
     "lastName": "lName",
     "email": "email@example.com",
     "password": "@password"
   }
   
4. User Login (Method: GET):
   ```
   http://localhost:8080/user/userLogin
   ```
   Request Body:
   ```
   {
     "email": "email@example.com",
     "password": "@password"
   }

5. Admin Login (Method: GET):
   ```
   http://localhost:8080/user/adminLogin
   ```
   Request Body:
   ```
   {
     "email": "email@example.com",
     "password": "@password"
   }

Conclusion
This backend project leverages Spring Boot to provide user authentication and authorization features, including user signup, login, and JWT-based authentication. The provided API endpoints enable interaction with different functionalities of the application.
