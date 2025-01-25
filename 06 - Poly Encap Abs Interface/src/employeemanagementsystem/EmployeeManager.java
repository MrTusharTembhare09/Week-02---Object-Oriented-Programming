package employeemanagementsystem;

// Utility Class: EmployeeManager
import java.util.*;

class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    // Adding an employee to the list
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    // Processing and displaying details of all employees
    public void processEmployees() {
        // Iterating through each employee in the list
        for (Employee e : employees) {
            // Displaying employee details
            e.displayDetails();

            // Calculating and displaying salary
            System.out.println("Calculated Salary: " + e.calculateSalary());

            // Displaying department details if applicable
            if (e instanceof Department) {
                System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            }
            System.out.println("-----------------------------------");
        }
    }
}
