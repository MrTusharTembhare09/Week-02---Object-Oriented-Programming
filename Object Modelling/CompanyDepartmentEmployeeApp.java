import java.util.ArrayList;

// Define the Employee class (each employee belongs to a department)
class Employee {
    private String name;
    private String position;

    // Constructor to initialize the employee with name and position
    // Adding an employee to a department
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Getter for employee position
    public String getPosition() {
        return position;
    }

    // Method to display employee details
    // Displaying employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name + ", Position: " + position);
    }
}

// Define the Department class (each department contains employees)
class Department {
    private String departmentName;
    private ArrayList<Employee> employees;  // A department contains multiple employees

    // Constructor to initialize the department with a name
    // Adding a department to the company
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    // Adding an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display details of the department and its employees
    // Displaying department details and its employees
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}

// Define the Company class (the company contains departments, and each department contains employees)
class Company {
    private String companyName;
    private ArrayList<Department> departments;  // A company contains multiple departments

    // Constructor to initialize the company with a name
    // Adding a company with a specific name
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    // Adding a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display the company details along with its departments and employees
    // Displaying company details, its departments, and their employees
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Method to simulate the deletion of the company, which also deletes its departments and employees
    // Deleting a company will automatically remove all its departments and employees (composition)
    public void deleteCompany() {
        departments.clear();  // Removes all departments and their employees
        System.out.println("Company " + companyName + " has been deleted, along with all departments and employees.");
    }
}

// Main class to demonstrate the composition relationship
public class CompanyDepartmentEmployeeApp {
    public static void main(String[] args) {
        // Create the company object
        Company company = new Company("TechCorp");

        // Create departments for the company
        Department department1 = new Department("Engineering");
        Department department2 = new Department("Marketing");

        // Create employees for the departments
        Employee employee1 = new Employee("Alice", "Software Engineer");
        Employee employee2 = new Employee("Bob", "Senior Software Engineer");
        Employee employee3 = new Employee("Charlie", "Marketing Manager");
        Employee employee4 = new Employee("David", "Marketing Executive");

        // Add employees to the departments
        department1.addEmployee(employee1);  // Adding Alice to Engineering
        department1.addEmployee(employee2);  // Adding Bob to Engineering
        department2.addEmployee(employee3);  // Adding Charlie to Marketing
        department2.addEmployee(employee4);  // Adding David to Marketing

        // Add departments to the company
        company.addDepartment(department1);  // Adding Engineering to TechCorp
        company.addDepartment(department2);  // Adding Marketing to TechCorp

        // Display details of the company, its departments, and employees
        company.displayCompanyDetails();

        // Delete the company (which deletes all departments and employees)
        company.deleteCompany();  // This will delete all departments and employees associated with TechCorp

        // Try displaying the company details after deletion (should show no departments or employees)
        company.displayCompanyDetails();  // No departments or employees should be displayed
    }
}
