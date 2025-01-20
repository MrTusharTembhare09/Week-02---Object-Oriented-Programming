public class Employee {
    static String companyName = "Global Company";
	
	String name;
	private final int id;
	String designation;
	
	private static int totalEmployee = 0;
	
    // Constructor to initialize employee details	
	public Employee(String name, int id, String designation) {
	    this.name = name;
		this.id = id;
		this.designation = designation;
		totalEmployee++;
	}
	
	// Instance method to display employee details
	public void displayDetails() {
	    if(this instanceof Employee) {
		    System.out.println("Employee Name : " + name);
		    System.out.println("Employee ID : " + id);
		    System.out.println("Employee designation : " + designation);
		}
		else {
		    System.out.println("Object is not an instance of Employee.");
		}
	}
	
	// Static method to get the total number of employee
    public static void getTotalEmployee() {
        System.out.println("Total Employee : " + totalEmployee);
    }
	
	public static void main(String[] args) {
	    // Creating employee objects
	    Employee e1 = new Employee("Rahul", 123, "Software Engineer");
	    Employee e2 = new Employee("Anjali", 534, "Data Analyst");	
		
		// Displaying employee details
		e1.displayDetails();
		e2.displayDetails();
		
		// Displaying the total employee using a static method
		Employee.getTotalEmployee();	
	}	
}


	
	
	
	
	
	
	