// Base class Person
class Person {
    // Defining common attributes for all persons
    String name;
    int age;
    
    // Constructor to initialize the Person attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display basic information about the person
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Method to display role (to be overridden by subclasses)
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass Teacher which extends Person
class Teacher extends Person {
    // Defining additional attribute for Teacher
    String subject; // Subject taught by the teacher
    
    // Constructor to initialize both Person and Teacher attributes
    public Teacher(String name, int age, String subject) {
        // Calling the constructor of the base class (Person)
        super(name, age);
        this.subject = subject;
    }
    
    // Overriding displayRole to show Teacher's role
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
    
    // Method to display subject taught by the teacher
    public void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}

// Subclass Student which extends Person
class Student extends Person {
    // Defining additional attribute for Student
    String grade; // Grade of the student
    
    // Constructor to initialize both Person and Student attributes
    public Student(String name, int age, String grade) {
        // Calling the constructor of the base class (Person)
        super(name, age);
        this.grade = grade;
    }
    
    // Overriding displayRole to show Student's role
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
    
    // Method to display grade of the student
    public void displayGrade() {
        System.out.println("Grade: " + grade);
    }
}

// Subclass Staff which extends Person
class Staff extends Person {
    // Defining additional attribute for Staff
    String position; // Position held by the staff
    
    // Constructor to initialize both Person and Staff attributes
    public Staff(String name, int age, String position) {
        // Calling the constructor of the base class (Person)
        super(name, age);
        this.position = position;
    }
    
    // Overriding displayRole to show Staff's role
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }
    
    // Method to display position of the staff
    public void displayPosition() {
        System.out.println("Position: " + position);
    }
}

// Main class to demonstrate the hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating a Teacher object
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        teacher.displayPersonDetails();
        teacher.displayRole();
        teacher.displaySubject();
        
        System.out.println("\n--------------------------\n");
        
        // Creating a Student object
        Student student = new Student("John Doe", 16, "10th Grade");
        student.displayPersonDetails();
        student.displayRole();
        student.displayGrade();
        
        System.out.println("\n--------------------------\n");
        
        // Creating a Staff object
        Staff staff = new Staff("Mrs. Lee", 50, "Principal");
        staff.displayPersonDetails();
        staff.displayRole();
        staff.displayPosition();
    }
}
