package hospitalpatientmanagement;

// Subclass: OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    // Constructor for OutPatient
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    // Calculating bill for out-patient
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Adding a medical record for out-patient
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    // Viewing medical records of out-patient
    @Override
    public String viewRecords() {
        return medicalHistory;
    }
}