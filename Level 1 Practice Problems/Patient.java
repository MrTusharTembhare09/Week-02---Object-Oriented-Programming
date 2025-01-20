// Creating the Patient class
public class Patient {

    // Static variable shared among all patients for the hospital name
    static String hospitalName = "CityCare Hospital";

    // Static variable to keep track of the total patients admitted
    private static int totalPatients = 0;

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Final variable to uniquely identify each patient
    private final String patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details using 'this'
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID; // Using this to resolve ambiguity
        this.name = name; // Using this to resolve ambiguity
        this.age = age; // Using this to resolve ambiguity
        this.ailment = ailment; // Using this to resolve ambiguity
        totalPatients++; // Incrementing total patients on each new patient creation
    }

    // Method to display patient details
    public void displayPatientDetails() {
        // Using instanceof to validate the object before processing
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital Name: " + hospitalName);
        } else {
            System.out.println("Object is not an instance of the Patient class.");
        }
    }

    public static void main(String[] args) {
        // Creating Patient objects
        Patient patient1 = new Patient("P001", "Alice", 30, "Fever");
        Patient patient2 = new Patient("P002", "Bob", 45, "Diabetes");
        Patient patient3 = new Patient("P003", "Charlie", 29, "Fracture");

        // Displaying details of each patient
        System.out.println("Patient Details:");
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
        System.out.println();
        patient3.displayPatientDetails();

        // Displaying total patients admitted
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());

        // Updating hospital name
        System.out.println("\nUpdating Hospital Name:");
        Patient.hospitalName = "Global Health Center";
        System.out.println("Hospital name updated to: " + Patient.hospitalName);

        // Displaying updated details
        System.out.println("\nUpdated Patient Details:");
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
        System.out.println();
        patient3.displayPatientDetails();
    }
}
