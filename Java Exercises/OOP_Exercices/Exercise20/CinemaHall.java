package oop_projects;

import java.util.ArrayList;

public class CinemaHall {
	private Movie movie;
	private ArrayList<Seat>seats = new ArrayList<Seat>();
	
	public CinemaHall(Movie movie, int numOfSeats) {
		this.movie = movie;
		for(int i=1; i<=numOfSeats; i++) {
				Seat seat = new Seat(i);
				seats.add(seat);
			}
	}
	public void bookSeat(int seatNumber) {
		for(Seat seat : seats) {
			if(seat.getNumber()==seatNumber) {
				if(seat.getIsBooked()) {
					System.out.println("Seat  "+seatNumber+ " already booked!");
					return;
				}
				else if (!seat.getIsBooked()) {
					seat.book();
					return;
				}
			}
		}
		System.out.println("Seat "+seatNumber+ " does not exist");
	}
	public void cancelSeat(int seatNumber) {
		for(Seat seat : seats) {
			if(seat.getNumber()==seatNumber) {
				if(seat.getIsBooked()) {
					seat.cancel();
					return;
				}
				else if (!seat.getIsBooked()) {
					System.out.println("Seat "+seatNumber+ "  is not booked");
					return;
				}
			}
		}
		System.out.println("Seat  "+seatNumber+ "  does not exist");
	}
	public void printFreeSeat() {
		System.out.println("Free Seats are:");
		for(Seat seat : seats) {
			if(!seat.getIsBooked()) {
				System.out.println("Seat # "+ seat.getNumber());
			}
		}
	}

}
