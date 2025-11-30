package oop_projects;

public class Student extends Person {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public String  getMajor() {
		return this.major;
	}
	@Override
	public String toString() {
		return getName()+" "+getAge()+ " "+getMajor();
	}
	

}
