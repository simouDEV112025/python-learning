package oop_projects;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Movie m1 = new Movie("The Shawshank Redemption", 9.3, "Drama");
		Movie m2 = new Movie("The Godfather", 9.2, "Crime");
		Movie m3 = new Movie("Pulp Fiction", 8.9, "Dark Comedy");
		Movie m4 = new Movie("Inception", 8.8, "Sci-Fi");
		
		MovieLibrary movieLibrary = new MovieLibrary();
		
		movieLibrary.addMovie(m1);
		movieLibrary.addMovie(m2);
		movieLibrary.addMovie(m3);
		movieLibrary.addMovie(m4);
		
		movieLibrary.removeMovie("Pulp Fiction");

		movieLibrary.printAllMovies();
		
		System.out.println("The highest rating movie is : " + movieLibrary.findHighestRated().getTitle());
	}

}
