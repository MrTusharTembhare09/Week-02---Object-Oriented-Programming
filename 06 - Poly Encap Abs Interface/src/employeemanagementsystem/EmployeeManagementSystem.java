package employeemanagementsystem;

// Main Class: EmployeeManagementSystem
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating an instance of EmployeeManager
        EmployeeManager manager = new EmployeeManager();

        // Adding a full-time employee
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Alice", 50000);
        fullTimeEmp.assignDepartment("Engineering");
        manager.addEmployee(fullTimeEmp);

        // Adding a part-time employee
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Bob", 0, 20, 25);
        partTimeEmp.assignDepartment("Support");
        manager.addEmployee(partTimeEmp);

        // Processing and displaying all employees
        manager.processEmployees();
    }
}
