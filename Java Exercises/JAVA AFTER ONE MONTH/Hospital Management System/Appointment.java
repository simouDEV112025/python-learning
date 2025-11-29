package oop_projects;

public class Appointment {
	private Patient patient;
	private Doctor doctor;
	private String date;
	
	public Appointment(Patient patient, Doctor doctor, String date) {
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
	}
	public Patient getPatient() {
		return this.patient;
	}
	public Doctor getDoctor() {
		return this.doctor;
	}
	public String getDate() {
		return this.date;
	}
	@Override
	public String toString() {
		return getPatient().getName()+" at "+getDate();
	}

}
