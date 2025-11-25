package oop_projects;

public class Main {

	public static void main(String[] args) {
		Playlist playlist = new Playlist();
		
		Song s1 = new Song("Bohemian Rhapsody", "Queen", 355);
		Song s2 = new Song("Billie Jean", "Michael Jackson", 294);
		Song s3 = new Song("Sweet Child O' Mine", "Guns N' Roses", 296);
		Song s4 = new Song("Shape of You", "Ed Sheeran", 433);
		Song s5 = new Song("Blinding Lights", "The Weeknd", 200);
		
		playlist.addSong(s1);
		playlist.addSong(s2);
		playlist.addSong(s3);
		playlist.addSong(s4);
		playlist.addSong(s5);
				
		System.out.println("The longest song is: " + playlist.findLongestSong().getTitle()
										+ " with a duration of " + playlist.findLongestSong().getDuration() + "s\n" );
		
		System.out.println("Total play durations of the playlist is : " + playlist.totalPlaylistDuration() + "s\n");
		
		playlist.removeSong("Ed Sheeran");
				
		playlist.printAll();


	}

}
 