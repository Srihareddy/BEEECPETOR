# User API – Documentation

BEEECPETOR is a Java-based REST API application developed to demonstrate core backend engineering skills such as object-oriented programming (OOP), CRUD operations, and RESTful service design.
The project simulates real-world client integrations using mock endpoints and follows a structured software development lifecycle (SDLC) approach.

This project was built with a focus on secure, scalable, and maintainable code, aligning with enterprise Java development standards.



#Tech Stack

Language: Java (Java 8+)

Architecture: RESTful APIs

Core Concepts: OOP, Java Collections (List, Map, Set)

Mock Integration: Beeceptor

Testing: API testing via REST clients

##  Base URL

#  Beeceptor API Link

For more information and monitoring, visit:  
 [Beeceptor CRUD API](https://beeceptor.com/crud-api/)

##  Endpoints

### GET All Users

Fetch all user records.

```bash
curl --location 'http://localhost:8080/proxy/users'
```bash

###  GET User by ID


```bash
curl --location 'http://localhost:8080/proxy/users/{id}'
curl --location 'http://localhost:8080/proxy/users/433c89113af1e8f797f4'



### POST Create User


```bash
curl --location 'http://localhost:8080/proxy/users' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "age": 30
}'



###  PUT Update User

```bash
curl --location 'http://localhost:8080/proxy/users/{id}' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
  "name": "John Doe Updated",
  "email": "john.doe.updated@example.com",
  "age": 31
}'



### DELETE User


```bash
curl --location --request DELETE 'http://localhost:8080/proxy/users/{id}'

Testing & Validation

# Use Cases

Backend API practice for Java developers

Testing frontend integrations

Mock server simulations

Practicing REST API consumption using JavaScript or frontend frameworks

Tested REST endpoints using API testing tools

Verified request validation, response handling, and error scenarios

Ensured consistent behavior across CRUD operations
Conclusion

This project demonstrates how enterprise-style Java REST APIs can be built and tested using mock services.
It reflects real-world backend development patterns commonly used in client-facing applications.
