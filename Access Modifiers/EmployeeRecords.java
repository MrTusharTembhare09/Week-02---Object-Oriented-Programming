// Creating the Employee class
class Employee {

    // Instance variables with different access modifiers
    public int employeeID; // Public: accessible from anywhere
    protected String department; // Protected: accessible within the same package and subclasses
    private double salary; // Private: accessible only within this class

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set the salary
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Creating the Manager subclass
class Manager extends Employee {

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); // Calling the parent class constructor
    }

    // Method to display manager-specific details
    public void displayManagerDetails() {
        System.out.println("Manager Employee ID: " + employeeID); // Accessing public member
        System.out.println("Manager Department: " + department); // Accessing protected member
    }
}

// Main class to test the functionality
public class EmployeeRecords {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "HR", 45000.0);
        emp.displayEmployeeDetails();

        // Modifying and accessing salary using public methods
        emp.setSalary(50000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());

        // Creating a Manager object
        Manager mgr = new Manager(102, "IT", 75000.0);
        mgr.displayManagerDetails();
    }
}

