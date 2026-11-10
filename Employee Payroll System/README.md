# Employee Payroll System

A console-based Employee Payroll System developed using Core Java to manage employee records and calculate salaries for full-time and part-time employees.

## Project Overview

This project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts and the Java Collections Framework.

It allows users to add employee records, display employee details, calculate salaries based on employee types, and remove employees using their IDs.

## Technologies Used

- Core Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- ArrayList
- Eclipse IDE

## Features

- **Add Employees:** Add full-time and part-time employee records.
- **Display Employees:** Display employee details, including name, ID, and calculated salary.
- **Salary Calculation:** Calculate salaries based on employee type.
- **Remove Employees:** Remove employee records using their employee ID.
- **Dynamic Employee Management:** Store and manage multiple employee objects using ArrayList.

## OOP Concepts Implemented

- **Abstraction:** Created an abstract `Employee` class with an abstract `calculateSalary()` method.
- **Inheritance:** Created `FullTimeEmployee` and `PartTimeEmployee` classes that inherit from the `Employee` class.
- **Encapsulation:** Used private fields to protect employee data and getter methods to access required information.
- **Polymorphism:** Used method overriding to implement different salary calculation methods for different employee types.
- **Method Overriding:** Overrode the `calculateSalary()` method in both subclasses.

## Salary Calculation

**Full-Time Employee**

The salary is based on a fixed monthly salary.

Example: Monthly Salary = ₹5,000

**Part-Time Employee**

The salary is calculated using the following formula:

`Salary = Hours Worked × Hourly Rate`

Example: 100 hours × ₹20 = ₹2,000

## Collections Framework

Used `ArrayList<Employee>` to store and manage multiple employee objects.

The ArrayList supports:
- Adding employee objects using `add()`.
- Iterating through employee records using an enhanced for loop.
- Removing employee objects using `remove()`.

## Project Structure

```text
EmployeePayrollSystem
│
└── src
    └── EmployeePayrolSystem
        └── Main.java
```

The `Main.java` file contains the following classes:

- `Employee` – Abstract parent class containing common employee details and salary calculation method.
- `FullTimeEmployee` – Calculates salary using a fixed monthly salary.
- `PartTimeEmployee` – Calculates salary based on hours worked and hourly rate.
- `PayRollSystem` – Manages employee records using ArrayList.
- `Main` – Contains the main method to execute the application.

## Sample Output

```text
Initial Employee Details:

Employee [name=Vikash, id=1, salary=5000.0]
Employee [name=Alex, id=2, salary=4000.0]
Employee [name=Rahul, id=3, salary=2000.0]

Removing Employees

Remaining Employee Details:

Employee [name=Vikash, id=1, salary=5000.0]
Employee [name=Rahul, id=3, salary=2000.0]
```

## How to Run the Project

1. Clone or download this repository.
2. Open Eclipse IDE.
3. Import the project into Eclipse as an existing Java project.
4. Open `Main.java`.
5. Run the program using **Run As → Java Application**.

## Limitations

- Employee records are stored in an ArrayList and are not permanently saved.
- The current version does not include database connectivity.
- Employee records are added through predefined objects in the main method.

## Learning Outcomes

Through this project, I gained practical experience in:

- Implementing OOP concepts in Java.
- Understanding abstraction, inheritance, encapsulation, and polymorphism.
- Using abstract classes and method overriding.
- Working with the Java Collections Framework and ArrayList.
- Managing multiple objects and implementing salary calculation logic.

---

**Developed using Core Java and Object-Oriented Programming.**