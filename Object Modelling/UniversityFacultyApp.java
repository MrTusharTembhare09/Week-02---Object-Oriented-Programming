import java.util.ArrayList;
import java.util.List;

// Define the Faculty class (a faculty member can belong to multiple departments or none)
class Faculty {
    private String name;

    // Constructor to initialize faculty with a name
    public Faculty(String name) {
        this.name = name;
    }

    // Getter for the name of the faculty member
    public String getName() {
        return name;
    }
}

// Define the Department class (contains faculty and can be deleted with the University)
class Department {
    private String departmentName;
    private List<Faculty> facultyList;  // Aggregation of faculty members

    // Constructor to initialize department with a name
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyList = new ArrayList<>();
    }

    // Getter for department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Method to add faculty to the department (aggregation)
    public void addFaculty(Faculty faculty) {
        if (!facultyList.contains(faculty)) {
            facultyList.add(faculty);
        }
    }

    // Method to display all faculty members in this department
    public void showFacultyMembers() {
        System.out.println("Faculty members in " + departmentName + " department:");
        for (Faculty faculty : facultyList) {
            System.out.println(faculty.getName());
        }
    }

    // Method to remove all faculty members from the department
    // Deleting the department will remove all faculty associated with it
    public void removeAllFaculty() {
        facultyList.clear();
    }
}

// Define the University class (contains departments and can delete them)
class University {
    private String universityName;
    private List<Department> departments;  // Composition with departments

    // Constructor to initialize university with a name
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Getter for university name
    public String getUniversityName() {
        return universityName;
    }

    // Method to add a department to the university (composition)
    public void addDepartment(Department department) {
        if (!departments.contains(department)) {
            departments.add(department);
        }
    }

    // Method to display all departments in the university
    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department department : departments) {
            System.out.println(department.getDepartmentName());
        }
    }

    // Method to delete the university and all associated departments (composition)
    public void deleteUniversity() {
        System.out.println("Deleting university: " + universityName);
        // Deleting the university will also delete all departments
        departments.clear();
    }
}

// Main class to demonstrate the composition and aggregation relationships
public class UniversityFacultyApp {
    public static void main(String[] args) {
        // Create university
        University university = new University("ABC University");

        // Create departments
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        // Add departments to the university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");
        Faculty faculty3 = new Faculty("Dr. Lee");

        // Add faculty to departments (Aggregation)
        dept1.addFaculty(faculty1);  // Dr. Smith is in Computer Science
        dept1.addFaculty(faculty2);  // Dr. Johnson is in Computer Science
        dept2.addFaculty(faculty3);  // Dr. Lee is in Mathematics

        // Display departments and faculty members
        university.showDepartments();
        dept1.showFacultyMembers();  // Faculty in Computer Science
        dept2.showFacultyMembers();  // Faculty in Mathematics

        // Now let's delete the university, which should delete all departments
        university.deleteUniversity();

        // After deletion, display departments again (should show none)
        university.showDepartments();  // No departments should be displayed
        dept1.showFacultyMembers();  // No faculty should be displayed in Computer Science
        dept2.showFacultyMembers();  // No faculty should be displayed in Mathematics
    }
}
