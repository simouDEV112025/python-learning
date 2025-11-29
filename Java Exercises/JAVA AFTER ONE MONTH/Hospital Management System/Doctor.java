package oop_projects;

public class Doctor {
	private String id;
	private String name;
	private String specialty;
	
	public Doctor(String id, String name, String specialty) {
		this.id = id;
		this.name = name;
		this.specialty = specialty;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getSpecialty() {
		return this.specialty;
	}

}
