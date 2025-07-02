# User API – Documentation

This API allows you to perform full CRUD ('Create', 'Read', 'Update', 'Delete') operations on user records using a 'RESTful' approach. It’s built using a mock proxy service via Beeceptor.

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
##  Conclusion

This API demonstrates how CRUD operations can be performed via a proxy using Beeceptor.  
Perfect for testing frontend integrations, mock servers, and JavaScript fetch calls.
