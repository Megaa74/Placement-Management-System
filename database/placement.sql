CREATE DATABASE placement_management;
USE placement_management;
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    department VARCHAR(50),
    cgpa DECIMAL(3,2)
);
INSERT INTO students(name, department, cgpa)
VALUES
('Megaa', 'CSE', 8.5),
('Mani', 'IT', 7.2);
