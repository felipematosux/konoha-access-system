# 🍃 Konoha Access System - Login Validation

A robust backend and frontend prototype for a secure ninja registration and login system. This project simulates the access control for the Hidden Leaf Village's confidential files, focusing on secure data handling and advanced error management.

### 🚀 About the Project
This system bridges a clean, responsive web interface prototype with a rigid Java backend. The primary focus of the Java architecture is to demonstrate mastery over **Advanced Exception Handling**, ensuring the system never crashes during unauthorized access attempts, invalid credentials, or file writing operations.

### 💻 Tech Stack
* **Backend:** Java (OOP, Collections, File I/O)
* **Frontend Prototype:** HTML5, CSS3
* **Tools:** Git, GitHub

### 🧠 Core Java Concepts Applied
* **Custom Exceptions:** Domain-specific error handling using Checked (`InvalidCredentialsException`) and Unchecked (`BannedNinjaException`) exceptions.
* **Method Overriding Constraints:** Strict adherence to Java's rules for throwing exceptions within implemented interface methods (`Authenticator`).
* **Try-with-Resources:** Automated and safe resource management for generating local access logs (`access_log.txt`) without memory leaks.
* **Multi-Catch Blocks:** Streamlined error interception for cleaner, more maintainable code.
* **In-Memory Database:** Utilization of Java Collections (Maps/Lists) to simulate database records before SQL integration.

### 📁 Project Structure
- `/frontend`: Contains the UI prototype (`index.html` and `style.css`).
- `/backend`: Contains the Java source code simulating the authentication server and generating access logs.

### ⚙️ How to Run
1. Clone the repository.
2. To view the UI, open `/frontend/index.html` in any web browser.
3. To test the security logic, compile and run `MainApplication.java` in your IDE or terminal. Try logging in with valid, invalid, and banned ninja profiles to see the exception handling in action!
