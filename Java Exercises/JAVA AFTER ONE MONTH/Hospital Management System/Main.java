package oop_projects;

public class Main {
    public static void main(String[] args) {
        HospitalSystem hs = new HospitalSystem();

        System.out.println("=== ADD DOCTORS ===");
        Doctor d1 = new Doctor("1", "KAMITO", "Heart");
        Doctor d2 = new Doctor("2", "HANABO", "Bone");
        Doctor d3 = new Doctor("3", "LISA", "Feet");

        hs.addDoctor(d1);
        hs.addDoctor(d2);
        hs.addDoctor(d3);

        System.out.println("=== ADD PATIENTS ===");
        Patient p1 = new Patient("1", "ISMAIL");
        Patient p2 = new Patient("2", "ADAM");
        Patient p3 = new Patient("3", "AHMED");

        hs.addPatien(p1);
        hs.addPatien(p2);
        hs.addPatien(p3);

        System.out.println("=== VALID APPOINTMENTS ===");
        hs.scheduleAppointment("1", "1", "10/10/2030");
        hs.scheduleAppointment("1", "2", "15/10/2030");
        hs.scheduleAppointment("2", "3", "01/01/2031");

        System.out.println("=== DOUBLE BOOKING TEST (should show error) ===");
        hs.scheduleAppointment("1", "3", "10/10/2030");

        System.out.println("=== NON-EXISTENT DOCTOR TEST ===");
        hs.scheduleAppointment("99", "1", "20/10/2030");

        System.out.println("=== NON-EXISTENT PATIENT TEST ===");
        hs.scheduleAppointment("1", "99", "20/10/2030");

        System.out.println("=== LIST DOCTOR 1 APPOINTMENTS ===");
        hs.listDoctorAppointments("1");

        System.out.println("=== LIST DOCTOR 3 (no appointments yet) ===");
        hs.listDoctorAppointments("3");

        System.out.println("=== CANCEL VALID APPOINTMENT ===");
        hs.cancelAppointment("1", "1", "10/10/2030");
        hs.listDoctorAppointments("1");

        System.out.println("=== CANCEL NON-EXISTENT APPOINTMENT ===");
        hs.cancelAppointment("1", "1", "10/10/2030");
    }
}
