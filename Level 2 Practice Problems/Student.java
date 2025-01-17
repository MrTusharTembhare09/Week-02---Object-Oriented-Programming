// Creating the Student class to represent a student
public class Student {

    // Declaring attributes for the student
    private String name;
    private int rollNumber;
    private double marks;

    // Creating a constructor to initialize the student attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculating the grade based on the marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Displaying the student's details and grade
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Creating the main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating a Student object with sample data
        Student student = new Student("John Doe", 101, 87.5);

        // Displaying the student's details and grade
        student.displayStudentDetails();
    }
}
