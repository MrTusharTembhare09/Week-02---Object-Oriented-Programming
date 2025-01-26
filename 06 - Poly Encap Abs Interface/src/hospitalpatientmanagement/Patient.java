package hospitalpatientmanagement;

// Abstract Class: Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Constructor for initializing patient details
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getting patient ID
    public int getPatientId() {
        return patientId;
    }

    // Setting patient ID
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    // Getting patient name
    public String getName() {
        return name;
    }

    // Setting patient name
    public void setName(String name) {
        this.name = name;
    }

    // Getting patient age
    public int getAge() {
        return age;
    }

    // Setting patient age
    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method for calculating patient bill
    public abstract double calculateBill();

    // Displaying patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
