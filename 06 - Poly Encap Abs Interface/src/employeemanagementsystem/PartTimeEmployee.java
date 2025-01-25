package employeemanagementsystem;

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String department;

    // Constructor for initializing PartTimeEmployee attributes
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // Getting work hours of part-time employee
    public int getWorkHours() {
        return workHours;
    }

    // Setting work hours of part-time employee
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    // Getting hourly rate of part-time employee
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setting hourly rate of part-time employee
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Calculating salary for part-time employee
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate; // Salary equals work hours multiplied by hourly rate
    }

    // Assigning a department to part-time employee
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    // Getting department details for part-time employee
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
