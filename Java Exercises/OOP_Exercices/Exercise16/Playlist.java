package oop_projects;

import java.util.ArrayList;

public class Playlist {
	private ArrayList<Song> songs = new ArrayList<Song>();
	
	public void addSong(Song song) {
		songs.add(song);
	}
	public void removeSong(String artist) {
		songs.removeIf(song -> song.getArtist().equals(artist));
	}
	public void printAll() {
		for(Song song : songs) {
			System.out.println(song);
		}
	}
	public Song findLongestSong() {
		Song longestSong = songs.get(0);
		for(int i=0; i<songs.size(); i++) {
			if(songs.get(i).getDuration()>longestSong.getDuration()) {
				longestSong = songs.get(i);
			} 
		}
		return longestSong;		
	}
	public int totalPlaylistDuration() {
		int total = 0;
		for(Song song : songs) {
			total+=song.getDuration();
		}
		return total;
	}

}
