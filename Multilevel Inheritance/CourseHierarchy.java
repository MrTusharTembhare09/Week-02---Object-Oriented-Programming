// Base class Course
class Course {
    // Defining attributes of the Course class
    String courseName;
    int duration; // Duration in hours
    
    // Constructor to initialize the Course attributes
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    
    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + duration + " hours");
    }
}

// Subclass OnlineCourse which extends Course
class OnlineCourse extends Course {
    // Defining additional attributes for OnlineCourse
    String platform; // Platform where the course is hosted
    boolean isRecorded; // Whether the course is recorded for later viewing
    
    // Constructor to initialize both Course and OnlineCourse attributes
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        // Calling the constructor of the base class (Course)
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    
    // Method to display OnlineCourse details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Calling the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass PaidOnlineCourse which extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    // Defining additional attributes for PaidOnlineCourse
    double fee; // Fee for the course
    double discount; // Discount offered for the course
    
    // Constructor to initialize both OnlineCourse and PaidOnlineCourse attributes
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        // Calling the constructor of the superclass (OnlineCourse)
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    
    // Method to display PaidOnlineCourse details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Calling the superclass method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

// Main class to demonstrate the hierarchy
public class CourseHierarchy {
    public static void main(String[] args) {
        // Creating a base Course object
        Course course1 = new Course("Intro to Java", 30);
        course1.displayCourseDetails();
        
        System.out.println("\n--------------------------\n");
        
        // Creating an OnlineCourse object
        OnlineCourse onlineCourse1 = new OnlineCourse("Advanced Java", 40, "Udemy", true);
        onlineCourse1.displayCourseDetails();
        
        System.out.println("\n--------------------------\n");
        
        // Creating a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse1 = new PaidOnlineCourse("Mastering Python", 50, "Coursera", false, 199.99, 20);
        paidOnlineCourse1.displayCourseDetails();
    }
}
