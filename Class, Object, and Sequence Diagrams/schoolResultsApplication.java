// Class representing a Subject
class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

// Class representing a Student
class Student {
    private String name;
    private Subject[] subjects;

    public Student(String name, Subject[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}

// Class for calculating grades
class GradeCalculator {
    public String calculateGrade(Student student) {
        int totalMarks = 0;
        int subjectCount = student.getSubjects().length;

        // Calculate total marks
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        // Calculate grade based on average marks
        double average = totalMarks / (double) subjectCount;
        if (average >= 90) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// Main class
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Creating Subject objects
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Creating Student object
        Subject[] subjects = {maths, science};
        Student student = new Student("John", subjects);

        // Creating GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculating grade
        String grade = gradeCalculator.calculateGrade(student);

        // Output the result
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + grade);
    }
}

