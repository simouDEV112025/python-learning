package oop_projects;

public class Movie {
	private String title;
	private String genre;
	
	public Movie(String title, String genre) {
		this.genre = genre;
		this.title = title;
	}
	public String getGenre() {
		return this.genre;
	}
	public String getTitle() {
		return this.title;
	}
	@Override
	public String toString() {
		return "Movie Title: " + getTitle() + " | Genre: " + getGenre();
	}

}
