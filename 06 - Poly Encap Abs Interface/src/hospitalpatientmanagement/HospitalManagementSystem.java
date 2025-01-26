package hospitalpatientmanagement;

// Main Class: HospitalManagementSystem
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patient instances
        Patient inPatient = new InPatient(1, "John Doe", 45, 5, 2000);
        Patient outPatient = new OutPatient(2, "Jane Smith", 30, 500);

        // Adding medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery.");
        ((MedicalRecord) outPatient).addRecord("Consulted for fever.");

        // Displaying details and bill for in-patient
        System.out.println("--- In-Patient Details ---");
        inPatient.getPatientDetails();
        System.out.println("Medical Records: \n" + ((MedicalRecord) inPatient).viewRecords());
        System.out.println("Total Bill: " + inPatient.calculateBill());

        // Displaying details and bill for out-patient
        System.out.println("--- Out-Patient Details ---");
        outPatient.getPatientDetails();
        System.out.println("Medical Records: \n" + ((MedicalRecord) outPatient).viewRecords());
        System.out.println("Total Bill: " + outPatient.calculateBill());
    }
}
