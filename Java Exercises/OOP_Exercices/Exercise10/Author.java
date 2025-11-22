package oop_projects;

public class Author {

	private String name;
	private String nationality;
	
	public Author(String name, String nationality) {
		this.name = name;
		this.nationality = nationality;
	}
	public String getName() {
		return this.name;
	}
	public String getNationality() {
		return this.nationality;
	}
}
