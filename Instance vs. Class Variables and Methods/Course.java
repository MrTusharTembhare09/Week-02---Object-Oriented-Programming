// Creating the Course class
public class Course {

    // Instance variables
    private String courseName;
    private int duration; // Duration in days
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "Unknown Institute"; // Default institute name

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    // Displaying the details of a specific course
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName); // Displaying the institute name
    }

    // Class method to update the institute name
    // Modifying the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName; // Updating the static institute name
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating Course objects
        Course course1 = new Course("Java Programming", 30, 200.0);
        course1.displayCourseDetails();

        Course course2 = new Course("Web Development", 40, 250.0);
        course2.displayCourseDetails();

        // Updating the institute name for all courses
        Course.updateInstituteName("Tech Institute");

        // Displaying course details after updating the institute name
        System.out.println("\nAfter updating the institute name:\n");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

