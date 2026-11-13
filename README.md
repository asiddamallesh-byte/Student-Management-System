# Student Management System

A web-based Student Management System built using **Java, Spring Boot, and MongoDB**. It allows users to create, view, search, update, and delete student records through a simple web dashboard.

## Features

- Add new student records
- View all students
- Search students by name, age, or email
- Update existing student details
- Delete student records
- Input validation for student details
- REST API with appropriate HTTP status codes
- MongoDB Atlas database integration
- Responsive web dashboard
- Centralized exception handling

## Technologies Used

| Technology | Purpose |
|---|---|
| Java 21 | Backend programming |
| Spring Boot | Backend framework |
| Spring Data MongoDB | Database integration |
| MongoDB Atlas | Database |
| HTML | Frontend structure |
| CSS | Frontend styling |
| JavaScript | Frontend functionality |
| Maven | Dependency management |

## Project Structure

```text
studentmanagement/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/studentmanagement/
│       │       ├── controller/
│       │       ├── service/
│       │       ├── repository/
│       │       ├── model/
│       │       ├── exception/
│       │       └── StudentmanagementApplication.java
│       └── resources/
│           ├── static/
│           │   └── index.html
│           └── application.properties
├── pom.xml
└── README.md
```

## Prerequisites

- Java 21
- MongoDB Atlas account
- Maven (or the included Maven Wrapper)
- VS Code or another Java IDE

## How to Run

1. Clone or download this repository.
2. Open the project in VS Code.
3. Configure your MongoDB Atlas connection in `application.properties`.
4. Make sure your database connection details are configured securely.
5. Open the project terminal and run:

```powershell
.\mvnw.cmd spring-boot:run
```

6. Open your browser:

```text
http://localhost:8080/
```

## REST API Endpoints

Base URL: `/students`

| Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Add a student |
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get a student by ID |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |

## Validation

The application validates student information, including:

- Student name cannot be empty.
- Email must have a valid format.
- Age must be between 1 and 120.

Invalid requests return HTTP 400 Bad Request.

## Database

The application uses MongoDB Atlas to store student records.

Database: `studentdb`

Collection: `students`

## Future Improvements

- User authentication and authorization
- Pagination and sorting
- Improved dashboard analytics
- Deployment to a cloud platform

## Author

Developed as a Java Spring Boot project to practice backend development, REST APIs, database integration, and frontend-backend communication.
