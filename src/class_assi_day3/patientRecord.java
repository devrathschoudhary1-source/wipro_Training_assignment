package class_assi_day3;

class patientRecord {
	private String medicalHistory = "Diabetes";

    public String getMedicalHistory(String role) {
        if (role.equals("Doctor")) {
            return medicalHistory;
        }
        return "Access Denied";
    }


public static void main(String[] args) {
    patientRecord p = new patientRecord();
    System.out.println(p.getMedicalHistory("Patient"));
    System.out.println(p.getMedicalHistory("Doctor"));
}
}
