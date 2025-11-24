package oop_projects;
import java.util.ArrayList;

public class MovieLibrary {
	private ArrayList<Movie> movies;
	
	public MovieLibrary() {
		this.movies = new ArrayList<>();
	}
	public ArrayList<Movie> getMovies() {
		return this.movies;
	}
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	public void removeMovie(String title) {
		for(int  i=0; i<movies.size(); i++) {
			if(title.equals(movies.get(i).getTitle())) {
				movies.remove(i);
			}
		}
	}
	public void printAllMovies() {
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}
	public Movie findHighestRated() {
		if(movies.isEmpty()) {
			return null;
		}
		Movie bestMovie = movies.get(0);
		for(Movie movie : movies) {
			if(movie.getRating() >= bestMovie.getRating()) {
				bestMovie = movie;
			}
		}
		return bestMovie;
	}

}
