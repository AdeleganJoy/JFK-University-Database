# 🏫 JFK-University-Database
This is a project created in April 2023.
It is a Java-based university database management utility that connects to a PostgreSQL database and interacts with various university-related tables. This project is designed for learning or demonstration purposes, featuring JDBC database queries and basic CRUD operations.

## 📋 Features

This project helps users with:
- Connecting to a PostgreSQL database using JDBC
- Retrieving and displaying data from multiple university-related tables like student, course, department, and enrollment
- Filtering data (e.g., students with GPA > X, courses by day/type)
- Updating records (e.g., modifying student grades)

## 💻 Tech Stack  

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![SQL](https://img.shields.io/badge/SQL-01718f?style=for-the-badge&logo=sqlite&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/postgresql-%23323330.svg?style=for-the-badge&logo=postgresql&logoColor=%23F7DF1E)

## ⚙️ Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/AdeleganJoy/JFK-University-Database.git
     ```
   
2. **Navigate to the project directory**:
   ```bash
   cd JFK-University-Database
     ```
3. **Open DatabaseCode.java and update the following lines with your own PostgreSQL credentials:**
   ```bash
   String url = "jdbc:postgresql://localhost:5432/your_db_name";
   String user = "your_username";
   String password = "your_password";
5. **Add the PostgreSQL JDBC driver to your classpath via command line:**
   ```bashc c
   javac -cp .;postgresql-42.x.jar DatabaseCode.java   # Windows
   javac -cp .:postgresql-42.x.jar DatabaseCode.java   # macOS/Linux
6. **Run the program**
   ```bashc c
   java -cp .;postgresql-42.x.jar DatabaseCode   # Windows
   java -cp .:postgresql-42.x.jar DatabaseCode   # macOS/Linux
## 🌐 Socials:
[![email](https://img.shields.io/badge/Email-D14836?logo=gmail&logoColor=white)](mailto:joyadelegan1@gmail.com) 
