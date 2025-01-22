import java.util.ArrayList;
import java.util.List;

// Define the Course class (a course can have multiple students)
class Course {
    private String courseName;
    private List<Student> enrolledStudents;  // List to store enrolled students

    // Constructor to initialize the course with a name
    // Adding a course to the system
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();  // Initializing the list of enrolled students
    }

    // Getter for the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to add a student to the course
    // Adding a student to the course
    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);  // Adding the course to the student's list of courses
        }
    }

    // Method to display the list of students enrolled in the course
    // Calculating the students enrolled in the course
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}

// Define the Student class (a student can enroll in multiple courses)
class Student {
    private String name;
    private List<Course> enrolledCourses;  // List to store the student's enrolled courses

    // Constructor to initialize the student with a name
    // Adding a student to the system
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();  // Initializing the list of enrolled courses
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Method to enroll the student in a course
    // Enrolling a student in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    // Method to view all courses the student is enrolled in
    // Displaying the courses a student is enrolled in
    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }
}

// Define the School class (a school has multiple students)
class School {
    private String schoolName;
    private List<Student> students;  // List to store students in the school

    // Constructor to initialize the school with a name
    // Adding a school to the system
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();  // Initializing the list of students
    }

    // Getter for school name
    public String getSchoolName() {
        return schoolName;
    }

    // Method to add a student to the school
    // Adding a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to display all students in the school
    // Calculating and displaying all students in the school
    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

// Main class to demonstrate the association and aggregation relationships
public class SchoolStudentCourseApp {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenwood High School");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        // Adding students to the school
        // Adding Alice, Bob, and Charlie to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Enroll students in courses
        // Alice and Bob are enrolled in Mathematics
        // Bob is enrolled in Science
        // Alice and Charlie are enrolled in History
        course1.addStudent(student1);  // Alice enrolls in Mathematics
        course1.addStudent(student2);  // Bob enrolls in Mathematics
        course2.addStudent(student2);  // Bob enrolls in Science
        course3.addStudent(student1);  // Alice enrolls in History
        course3.addStudent(student3);  // Charlie enrolls in History

        // Display all students in the school
        // Displaying the list of students in the school
        school.showAllStudents();

        // Display the courses a student is enrolled in
        // Showing the courses each student is enrolled in
        student1.viewEnrolledCourses();  // Alice's courses
        student2.viewEnrolledCourses();  // Bob's courses
        student3.viewEnrolledCourses();  // Charlie's courses

        // Display students enrolled in a course
        // Displaying the students enrolled in each course
        course1.showEnrolledStudents();  // Students in Mathematics
        course2.showEnrolledStudents();  // Students in Science
        course3.showEnrolledStudents();  // Students in History
    }
}
