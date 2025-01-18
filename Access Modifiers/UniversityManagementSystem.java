// Creating the Student class
class Student {

    // Instance variables with different access modifiers
    public int rollNumber; // Public: accessible from anywhere
    protected String name; // Protected: accessible within the same package and subclasses
    private double CGPA; // Private: accessible only within this class

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Creating the PostgraduateStudent class (Subclass)
class PostgraduateStudent extends Student {

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); // Calling the parent class constructor
    }

    // Method to display the postgraduate student's name
    public void displayPostgraduateStudentName() {
        System.out.println("Postgraduate Student Name: " + name);
    }
}

// Main class to test the functionality
public class UniversityManagementSystem {

    public static void main(String[] args) {
        // Creating Student and PostgraduateStudent objects
        Student student1 = new Student(101, "John Doe", 8.5);
        student1.displayStudentDetails();

        // Modifying CGPA using public method
        student1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Jane Smith", 9.2);
        pgStudent.displayStudentDetails();

        // Displaying the postgraduate student's name
        pgStudent.displayPostgraduateStudentName();
    }
}

