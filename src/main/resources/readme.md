Project Title: Employee Management System (Spring Boot CRUD Application)

Description:
The Employee Management System is a backend application developed using Spring Boot and MySQL. It provides RESTful endpoints for managing employee records through CRUD operations.

Key Features:

RESTful API Endpoints: Allows CRUD operations on employee records (GET, POST, PUT, DELETE).
Exception Handling: Custom exception handling for providing informative error responses.
Database Schema: MySQL database schema (employee_directory) with a single table (employee) for storing employee details.
Deployment Instructions: Instructions for setting up and running the application locally.

Technologies Used:
Java
Spring Boot
Spring Data JPA
MySQL
Hibernate
Maven
JUnit (for testing, if applicable)
Getting Started:

Prerequisites: Ensure Java 8, Spring Boot(Version 3.3.1), MySQL (version 8.0.31), and Maven are installed.

Database Setup:
Create a database named employee_directory in MySQL.
Run the SQL script provided in src/main/resources/data.sql to create the employee table and populate sample data.

Application Configuration:
Configure database connection properties in application.properties (e.g., spring.datasource.url, spring.datasource.username, spring.datasource.password).

Running the Application:
Clone the repository and navigate to the project directory.
Execute mvn spring-boot:run to start the Spring Boot application.
The application will be accessible at http://localhost:8087.

API Endpoints:
gitGET /api/employees: Retrieve all employees.
GET /api/employees/{id}: Retrieve employee by ID.
POST /api/employees: Add a new employee.
PUT /api/employees: Update an existing employee.
DELETE /api/employees/{id}: Delete employee by ID.

Contributing:
Contributions are welcome. Fork the repository, make changes, and submit a pull request.
