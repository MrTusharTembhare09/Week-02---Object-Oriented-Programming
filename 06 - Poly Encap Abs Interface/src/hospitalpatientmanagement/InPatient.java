package hospitalpatientmanagement;

// Subclass: InPatient
class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private double dailyRate;
    private String medicalHistory;

    // Constructor for InPatient
    public InPatient(int patientId, String name, int age, int numberOfDays, double dailyRate) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
        this.medicalHistory = "";
    }

    // Calculating bill for in-patient
    @Override
    public double calculateBill() {
        return numberOfDays * dailyRate;
    }

    // Adding a medical record for in-patient
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    // Viewing medical records of in-patient
    @Override
    public String viewRecords() {
        return medicalHistory;
    }
}
