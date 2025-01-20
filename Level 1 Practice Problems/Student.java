// Creating the Student class
public class Student {

    // Static variable shared by all students for the university name
    static String universityName = "Global University";

    // Static variable to track the total number of students
    static int totalStudents = 0;

    // Static method to display the total number of students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Final variable to ensure each student has a unique roll number
    private final int rollNumber;

    // Instance variables
    private String name;
    private String grade;

    // Constructor to initialize student details using 'this'
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber; // Using this to resolve ambiguity
        this.name = name; // Using this to resolve ambiguity
        this.grade = grade; // Using this to resolve ambiguity
        totalStudents++; // Incrementing total students when a new student is created
    }

    // Method to display student details
    public void displayStudentDetails() {
        // Using instanceof to validate the object before processing
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Object is not an instance of Student.");
        }
    }

    // Method to update the grade of the student
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade; // Using this to update grade
            System.out.println("Grade updated for Roll Number: " + rollNumber);
        } else {
            System.out.println("Object is not an instance of Student.");
        }
    }

    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");

        // Displaying details of each student
        System.out.println("Student Details:");
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        // Updating grade for a student
        System.out.println("\nUpdating Grade:");
        student2.updateGrade("A+");

        // Displaying details after grade update
        System.out.println("\nUpdated Student Details:");
        student2.displayStudentDetails();

        // Displaying total students enrolled
        System.out.println("\nUniversity Details:");
        Student.displayTotalStudents();
    }
}
