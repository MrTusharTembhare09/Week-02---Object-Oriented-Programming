class Employee {
    // Defining the attributes
    String name;
    int id;
    double salary;

    // Defining the constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Displaying the details
    void displayDetails() {
        System.out.println("Employee name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee salary is : " + salary);
    }
}

public class EmployeeDetails01 {
    public static void main(String[] args) {
        //Creating an object for employee
        Employee e = new Employee("Harry Potter", 21, 450000);
        e.displayDetails();
    }
}
