# E-Wallet Microservices

This Project contain two independent Spring Boot Applications
* UserService
* WalletService

### UserService:

* **UserService** is a Spring Boot JPA application that stores user information.
* MySql Databse is used.
* Swagger for API documentation is also used. 
http://localhost:8080/swagger-ui.html#/

Database Name: **EWallet**
Table: User

### WalletService:

* **WalletService** is a Spring Boot JPA application that stores user wallet information.
* MySql and Redis databases are used.
* Kafka is used for messaging queue.
* Transaction APIs for sendMoney, getBalance etc.
* Wallet APIs for createNewWallet, updateWallet etc.
* User id and balance stored in Redis.
* **Resttemplate** is used to intracts with **UserService** microservice.
* EmailService class is responsible for sending email to a user for transaction history.
* Swagger for API documentation.
http://localhost:8081/swagger-ui.html#



Database Name: **EWallet**
Tables: Transaction, Wallet
