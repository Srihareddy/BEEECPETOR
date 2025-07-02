GET : curl --location 'http://localhost:8080/proxy/users'
GET BY ID: curl --location 'http://localhost:8080/proxy/users/433c89113af1e8f797f4'
POST: curl --location 'http://localhost:8080/proxy/users' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "age": 30
  }'
