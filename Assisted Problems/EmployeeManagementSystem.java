// Defining the base class Employee
class Employee {
    String name;
    int id;
    double salary;

    // Adding constructor to initialize Employee attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Defining a method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Defining the subclass Manager
class Manager extends Employee {
    int teamSize;

    // Adding constructor to initialize Manager attributes
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding the displayDetails() method to include team size
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Defining the subclass Developer
class Developer extends Employee {
    String programmingLanguage;

    // Adding constructor to initialize Developer attributes
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding the displayDetails() method to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Defining the subclass Intern
class Intern extends Employee {
    String universityName;

    // Adding constructor to initialize Intern attributes
    public Intern(String name, int id, double salary, String universityName) {
        super(name, id, salary);
        this.universityName = universityName;
    }

    // Overriding the displayDetails() method to include university name
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + universityName);
    }
}

// Main class to demonstrate the Employee Management System
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating objects for different employee types
        Employee manager = new Manager("Alice", 101, 90000, 10);
        Employee developer = new Developer("Bob", 102, 75000, "Java");
        Employee intern = new Intern("Charlie", 103, 20000, "XYZ University");

        // Displaying details of each employee
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}