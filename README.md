# Full Stack Application (Spring Boot + ReactJS + PostgreSQL)

This is a full stack application built with **Spring Boot** (backend), **ReactJS** (frontend), and **PostgreSQL** as the database.

---

## 📋 Prerequisites

- Java 17 or higher
- Maven or Gradle
- Node.js (v16+ recommended) and npm
- PostgreSQL installed and running
- Git & IDE (e.g., IntelliJ, VS Code)

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

**Specification to connect POSTGRESQL**

spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
server.port=8080

