package oop_projects;

public class Main {

	public static void main(String[] args) {		
		Movie m1 = new Movie("Inception:", "Sci-Fi / Action / Thriller");
		Movie m2 = new Movie("Parasite:", "Thriller / Dark Comedy / Drama");
		Movie m3 = new Movie("Everything Everywhere All at Once:", "SAbsurdism / Action / Sci-Fi / Comedy / Drama");
		Movie m4 = new Movie("The Grand Budapest Hotel:", "Comedy / Adventure / Crime");
		Movie m5 = new Movie("Dune: Part Two:", "Epic Sci-Fi / Adventure / Drama");
		
		CinemaHall c1 = new CinemaHall(m1, 17);
		CinemaHall c2 = new CinemaHall(m2, 7);
		CinemaHall c3 = new CinemaHall(m3, 1);
		CinemaHall c4 = new CinemaHall(m4, 37);
		CinemaHall c5 = new CinemaHall(m5, 128);
		
		c1.bookSeat(6);
		c1.bookSeat(6);
		c1.bookSeat(18);
		c1.printFreeSeat();


		
		


	}

}
 