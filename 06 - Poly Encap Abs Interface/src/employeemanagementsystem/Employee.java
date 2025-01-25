package employeemanagementsystem;

// Abstract Class: Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor for initializing employee attributes
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getting employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Setting employee ID
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getting employee name
    public String getName() {
        return name;
    }

    // Setting employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getting base salary of the employee
    public double getBaseSalary() {
        return baseSalary;
    }

    // Setting base salary of the employee
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method for calculating salary
    public abstract double calculateSalary();

    // Displaying employee details
    public void displayDetails() {
        // Adding employee details display
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
