package oop_projects;

public class Song {
	private String title;
	private String artist;
	private int duration;
	
	public Song(String title, String artist, int duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return this.artist;
	}
	public int getDuration() {
		return this.duration;
	}
	@Override
	public String toString() {
		return "Title: " + getTitle() + " ,Artist: " + getArtist() + " ,Duration: " + getDuration() + "s";
	}

}
