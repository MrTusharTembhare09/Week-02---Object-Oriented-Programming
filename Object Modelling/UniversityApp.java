import java.util.ArrayList;
import java.util.List;

// Define the Course class (students can enroll in courses, and professors teach courses)
class Course {
    private String courseName;
    private Professor professor;  // Aggregation with Professor (professor teaches the course)
    private List<Student> students;  // Aggregation with students (students enroll in the course)

    // Constructor to initialize the course with a name
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Getter for the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to assign a professor to this course
    // assigning professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course
    // enrolling student in the course
    public void enrollStudent(Student student) {
        students.add(student);  // Adding student to the course's list of students
    }

    // Method to view the course details (including professor and students)
    // calculating and displaying course details, professor, and enrolled students
    public void viewCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }

        System.out.println("Students enrolled in this course:");
        for (Student student : students) {
            System.out.println(student.getName());  // Displaying each enrolled student
        }
    }
}

// Define the Student class (students can enroll in courses)
class Student {
    private String name;
    private List<Course> courses;  // Association with courses (students enroll in multiple courses)

    // Constructor to initialize the student with a name
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }

    // Method to enroll the student in a course
    // enrolling student in the course
    public void enrollCourse(Course course) {
        courses.add(course);  // Adding course to the student's list of courses
        course.enrollStudent(this);  // Enrolling the student in the course as well
    }

    // Method to view all courses the student has enrolled in
    // calculating and displaying all courses for the student
    public void viewEnrolledCourses() {
        System.out.println(name + "'s enrolled courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());  // Displaying the name of each enrolled course
        }
    }
}

// Define the Professor class (professors teach courses)
class Professor {
    private String name;
    private List<Course> courses;  // Association with courses (professors teach multiple courses)

    // Constructor to initialize the professor with a name
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Getter for the professor's name
    public String getName() {
        return name;
    }

    // Method to assign the professor to a course
    // assigning professor to the course
    public void assignToCourse(Course course) {
        courses.add(course);  // Adding course to the professor's list of courses
        course.assignProfessor(this);  // Assigning this professor to the course
    }

    // Method to view all courses the professor is teaching
    // calculating and displaying all courses for the professor
    public void viewCoursesTaught() {
        System.out.println(name + "'s taught courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());  // Displaying each course taught by the professor
        }
    }
}

// Main class to demonstrate the University Management System
public class UniversityApp {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Mathematics 101");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Assign professors to courses
        professor1.assignToCourse(course1);  // Dr. Smith is assigned to Computer Science 101
        professor2.assignToCourse(course2);  // Dr. Johnson is assigned to Mathematics 101

        // Enroll students in courses
        student1.enrollCourse(course1);  // Alice enrolls in Computer Science 101
        student1.enrollCourse(course2);  // Alice enrolls in Mathematics 101
        student2.enrollCourse(course1);  // Bob enrolls in Computer Science 101

        // View courses and students
        course1.viewCourseDetails();  // Display details for Computer Science 101
        course2.viewCourseDetails();  // Display details for Mathematics 101

        // View student enrollment
        student1.viewEnrolledCourses();  // Alice's enrolled courses
        student2.viewEnrolledCourses();  // Bob's enrolled courses

        // View professor courses
        professor1.viewCoursesTaught();  // Dr. Smith's courses
        professor2.viewCoursesTaught();  // Dr. Johnson's courses
    }
}
