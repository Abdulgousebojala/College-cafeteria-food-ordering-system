# College-cafeteria-food-ordering-system
Backend system for a cafeteria food ordering application using Spring Boot, JWT authentication, MySQL, JPA, and RESTful APIs with menu, cart, and order processing.spring-boot java jwt mysql rest-api food-ordering-system backend


A backend application for a cafeteria food ordering system built using Spring Boot and JWT authentication.

Tech Stack
Java
Spring Boot
Spring Security (JWT)
Spring Data JPA
MySQL
REST APIs
Apache Kafka

Features

User Registration
User Login with JWT Authentication
Menu Management (Admin)
View Menu (Users)
Cart System
Order Processing
Secure API access using JWT

 API Endpoints

 Authentication
POST /auth/register  
POST /auth/login  

 Menu

GET /menu  

Admin Menu Management

POST /admin/menu  
PUT /admin/menu/{id}  
DELETE /admin/menu/{id}  

Cart

POST /cart/add  
GET /cart/{userId}  
DELETE /cart/remove/{id}  

Orders

POST /order/place/{userId}
How to Run

1. Clone the repository

