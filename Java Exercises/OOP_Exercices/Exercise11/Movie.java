package oop_projects;

public class Movie {
	private String title;
	private double rating;
	private String genre;
	
	public Movie(String title, double rating, String genre) {
		this.title = title;
		this.rating = rating;
		this.genre = genre;
	}
	public String getTitle() {
		return this.title;
	}
	public double getRating() {
		return this.rating;
	}
	public String getGenre() {
		return this.genre;
	}
	@Override
	public String toString() {
		return "Title: " + this.title + " | Rating: " + this.rating + " | Genre: " + this.genre; 
	}
}
