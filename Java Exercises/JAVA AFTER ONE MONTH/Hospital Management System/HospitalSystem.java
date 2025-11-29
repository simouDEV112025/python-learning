package oop_projects;

import java.util.ArrayList;
import java.util.Iterator;

public class HospitalSystem {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	public void addPatien(Patient patient) {
		patients.add(patient);
	}
	public Doctor getDoctorById(String doctorId) {
		Doctor getDoctor = null;
		for(Doctor doctor : doctors) {
			if (doctor.getId().equals(doctorId)) {
				getDoctor=doctor;
				break;
			}
		}
		return getDoctor;
	}
	public Patient getPatientById(String patientId) {
		Patient getPatient = null;
		for(Patient patient : patients) {
			if (patient.getId().equals(patientId)) {
				getPatient=patient;
				break;
			}
		}
		return getPatient;
	}
	public void scheduleAppointment(String doctorId, String patientId, String date) {
		Doctor addDoctor =  getDoctorById(doctorId);
		if(addDoctor==null) {
			System.out.println("Doctor not found");
			return;
		}
		Patient addPatient = getPatientById(patientId);
		if (addPatient==null) {
			System.out.println("Patient not found");
			return;
		}
		for(Appointment appointment : appointments) {
			if (appointment.getDoctor().equals(addDoctor) && appointment.getDate().equals(date)) {
				System.out.println(addDoctor.getName()+" is not available in "+date);
				return;
			}
		}
		Appointment newAppointment = new Appointment(addPatient, addDoctor, date);
		appointments.add(newAppointment);
	}
	public void cancelAppointment(String doctorId, String patientId, String date) {
		Doctor addDoctor = getDoctorById(doctorId);
		if(addDoctor==null) {
			System.out.println("Doctor not found");
			return;
		}
		Patient addPatient = getPatientById(patientId);
		if(addPatient==null) {
			System.out.println("Patient not found");
			return;
		}
		Iterator<Appointment> it = appointments.iterator();
		while(it.hasNext()) {
			Appointment a = it.next();
			if(a.getDoctor().equals(addDoctor)&&a.getPatient().equals(addPatient)&&a.getDate().equals(date)) {
				it.remove();
				return;
			}
		}
		System.out.println("Appointment does not exist");
	}
	public void listDoctorAppointments(String doctorId) {
		Doctor addDoctor = getDoctorById(doctorId);
		if(addDoctor==null) {
			System.out.println("Doctor not found");
			return;
		}
		boolean isFound= false;
		System.out.println(addDoctor.getName()+"'s appointment list is: ");

		for(Appointment appointment : appointments) {
			if(appointment.getDoctor().equals(addDoctor)) {
				System.out.println(appointment);
				isFound=true;
			}
		}
		if (!isFound) {
			System.out.println("no appointments found");
		}
	}
	
}
