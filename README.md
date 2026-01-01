# BEEECPETOR – Java REST API (User Management)

A **Java REST API application** demonstrating **secure, scalable, and maintainable backend design** using **CRUD operations**, **object-oriented programming (OOP)** principles, and **mock endpoint integrations**.

---

##  Overview
BEEECPETOR is a Java-based REST API application developed to demonstrate **core backend engineering skills**, including **RESTful service design**, **Java Collections**, and **modular service-layer architecture**.

The project simulates **real-world client integrations** using mock endpoints via **Beeceptor** and follows a structured **Software Development Life Cycle (SDLC)** approach.  
It is built with a strong focus on **enterprise Java development standards**.

---

##  Why This Project
This API was developed to practice backend development fundamentals in Java, including:
- RESTful API design  
- Data handling using **Java Collections (List, Map, Set)**  
- Modular and maintainable service-layer architecture  
- Structured testing and validation of API workflows  

---

## 🛠️ Tech Stack
- **Language:** Java (Java 8+)  
- **Architecture:** RESTful APIs  
- **Core Concepts:** OOP, Java Collections (List, Map, Set)  
- **Mock Integration:** Beeceptor  
- **Testing:** API testing using REST clients  

---

##  Base URL
http://localhost:8080/proxy

---

##  Beeceptor API Reference
For mock API behavior and monitoring:
- https://beeceptor.com/crud-api/

---

##  API Endpoints

### 🔹 Get All Users
Fetch all user records.

```bash
curl --location 'http://localhost:8080/proxy/users'
```
🔹 Get User by ID

Fetch a specific user by ID.

```bash
curl --location 'http://localhost:8080/proxy/users/{id}'
```

Example:
```bash
curl --location 'http://localhost:8080/proxy/users/433c89113af1e8f797f4'
```

🔹 Create User

Create a new user record.
```bash
curl --location 'http://localhost:8080/proxy/users' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "age": 30
}'
```
🔹 Update User

Update an existing user.
```bash
curl --location 'http://localhost:8080/proxy/users/{id}' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
  "name": "John Doe Updated",
  "email": "john.doe.updated@example.com",
  "age": 31
}'
```
🔹 Delete User

Delete a user by ID.
```bash
curl --location --request DELETE 'http://localhost:8080/proxy/users/{id}'
```
## Testing & Validation

Tested all REST endpoints using API testing tools

Verified request validation, response formatting, and error scenarios

Ensured consistent behavior across all CRUD operations

## Use Cases

Backend API practice for Java developers

Testing frontend integrations

Mock server simulations

Practicing REST API consumption using JavaScript or frontend frameworks

## Conclusion

This project demonstrates how enterprise-style Java REST APIs can be designed, implemented, and tested using mock services.
It reflects real-world backend development patterns commonly used in client-facing applications.


