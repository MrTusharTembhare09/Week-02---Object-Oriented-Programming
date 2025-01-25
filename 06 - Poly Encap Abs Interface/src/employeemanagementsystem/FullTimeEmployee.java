package employeemanagementsystem;

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private String department;

    // Constructor for initializing FullTimeEmployee attributes
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Calculating salary for full-time employee
    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Full-time employee salary equals base salary
    }

    // Assigning a department to full-time employee
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    // Getting department details for full-time employee
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
