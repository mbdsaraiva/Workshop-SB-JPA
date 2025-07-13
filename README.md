# ☁️ Web Services Project with Spring Boot and JPA/Hibernate

This project implements a robust web services backend using Java, Spring Boot, JPA, and Hibernate. It focuses on building a comprehensive system with a well-defined domain model, logical layers, and full CRUD (Create, Retrieve, Update, Delete) capabilities, along with proper exception handling.

## 🚀 About the Project

The core objective of this project is to demonstrate the development of RESTful web services using modern Java frameworks. It covers the entire lifecycle of data management, from defining the domain entities and their relationships to persisting data in a database and exposing it through a well-structured API. The project emphasizes best practices in backend development, including layered architecture and robust error management.




## 💻 Technologies and Concepts Used

This project leverages a powerful stack of technologies and adheres to key software development concepts:

### Core Technologies

*   **Java**: The primary programming language, specifically Java 17, for building the backend application.
*   **Spring Boot**: A framework that simplifies the development of production-ready Spring applications, enabling rapid development and deployment of web services.
*   **Spring Data JPA**: Provides an easy way to implement data access layers, significantly reducing boilerplate code for CRUD operations.
*   **Hibernate**: An Object-Relational Mapping (ORM) framework that facilitates interaction between the Java application and the relational database.

### Database

*   **H2 Database**: An in-memory relational database used for testing and development purposes, providing a lightweight and fast environment for data persistence during development cycles.

### Architectural Concepts

*   **Layered Architecture**: The project is structured into distinct logical layers:
    *   **Resource Layer**: Handles incoming HTTP requests and returns responses, acting as the API endpoint.
    *   **Service Layer**: Contains the business logic, processing requests from the resource layer and interacting with the repository layer.
    *   **Repository Layer**: Manages data persistence, abstracting database operations and interacting with JPA/Hibernate.
*   **Domain Model**: A clear and well-defined representation of the business entities and their relationships, forming the core of the application's data structure.

### Key Features and Practices

*   **Dependency Injection**: Utilized extensively by Spring to manage component dependencies, promoting loose coupling and testability.
*   **Database Seeding**: Initial data is populated into the H2 database upon application startup, providing a consistent environment for testing and development.
*   **Exception Handling**: Robust mechanisms are implemented to gracefully handle errors and provide meaningful responses to clients.
*   **Object-Relational Mapping (ORM)**: JPA and Hibernate are used to map Java objects to database tables, simplifying data manipulation and persistence.




## ✨ Implemented Features

This project demonstrates the implementation of several key features essential for a robust web service:

*   **CRUD Operations**: Full Create, Retrieve, Update, and Delete functionalities are implemented for various entities, allowing complete management of data through the API.
*   **Domain Entities**: Key domain entities such as `User`, `Order`, `Category`, `Product`, `OrderItem`, and `Payment` are modeled with their respective attributes and relationships.
*   **Associations**: Different types of associations between entities are implemented, including one-to-many, many-to-many with `JoinTable`, and many-to-many with extra attributes (`OrderItemPK`).
*   **Order Management**: Functionality to manage orders, including order status, instant timestamps, and association with users and products.
*   **Product Catalog**: Management of products with categories, prices, and descriptions.
*   **Payment Integration**: Basic payment entity modeling and association with orders.
*   **Subtotal & Total Calculations**: Methods for calculating subtotal and total amounts for orders.
