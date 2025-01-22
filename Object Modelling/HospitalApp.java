import java.util.ArrayList;
import java.util.List;

// Define the Patient class (can consult multiple doctors)
class Patient {
    private String name;
    private List<Doctor> doctors;  // Association with doctors

    // Constructor to initialize the patient with a name
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Getter for the patient's name
    public String getName() {
        return name;
    }

    // Method to add a doctor to the patient’s list of doctors (consult multiple doctors)
    // adding doctor to the list of doctors for the patient
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);  // Adding doctor to the patient's list of doctors
        }
    }

    // Method to view all doctors that the patient has consulted
    // calculating and displaying the list of doctors for this patient
    public void viewDoctors() {
        System.out.println("Doctors consulted by " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());  // Displaying each doctor consulted by the patient
        }
    }
}

// Define the Doctor class (can consult multiple patients)
class Doctor {
    private String name;
    private List<Patient> patients;  // Association with patients

    // Constructor to initialize the doctor with a name
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Getter for the doctor's name
    public String getName() {
        return name;
    }

    // Method for a doctor to consult a patient
    // calculating and showing the consultation between doctor and patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);  // Adding patient to the doctor's list of patients
        }
        System.out.println(name + " is consulting " + patient.getName() + ".");  // Communication - Consultation
    }

    // Method to view all patients the doctor has consulted
    // calculating and displaying the list of patients for this doctor
    public void viewPatients() {
        System.out.println("Patients consulted by Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println(patient.getName());  // Displaying each patient consulted by the doctor
        }
    }
}

// Define the Hospital class (manages doctors and patients)
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor to initialize the hospital with a name
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Getter for hospital name
    public String getHospitalName() {
        return hospitalName;
    }

    // Method to add a doctor to the hospital
    // adding doctor to the hospital's list of doctors
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);  // Adding doctor to the hospital's list
        }
    }

    // Method to add a patient to the hospital
    // adding patient to the hospital's list of patients
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);  // Adding patient to the hospital's list
        }
    }

    // Method to view all doctors in the hospital
    // calculating and displaying the list of doctors in the hospital
    public void showDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());  // Displaying each doctor in the hospital
        }
    }

    // Method to view all patients in the hospital
    // calculating and displaying the list of patients in the hospital
    public void showPatients() {
        System.out.println("Patients in " + hospitalName + ":");
        for (Patient patient : patients) {
            System.out.println(patient.getName());  // Displaying each patient in the hospital
        }
    }
}

// Main class to demonstrate the association and communication between doctors and patients
public class HospitalApp {
    public static void main(String[] args) {
        // adding a hospital
        Hospital hospital = new Hospital("City Hospital");

        // adding doctors to the hospital
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");
        hospital.addDoctor(doctor1);  // Adding Dr. Smith to the hospital's list of doctors
        hospital.addDoctor(doctor2);  // Adding Dr. Johnson to the hospital's list of doctors

        // adding patients to the hospital
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        hospital.addPatient(patient1);  // Adding Alice to the hospital's list of patients
        hospital.addPatient(patient2);  // Adding Bob to the hospital's list of patients

        // calculating consultations: Dr. Smith consults Alice and Bob, Dr. Johnson consults Alice
        doctor1.consult(patient1);  // Dr. Smith consulting Alice
        doctor1.consult(patient2);  // Dr. Smith consulting Bob
        doctor2.consult(patient1);  // Dr. Johnson consulting Alice

        // displaying doctors and their consultations
        hospital.showDoctors();  // Showing all doctors in the hospital
        doctor1.viewPatients();  // Dr. Smith's patients
        doctor2.viewPatients();  // Dr. Johnson's patients

        // displaying patients and their consultations
        hospital.showPatients();  // Showing all patients in the hospital
        patient1.viewDoctors();  // Alice's doctors
        patient2.viewDoctors();  // Bob's doctors
    }
}
