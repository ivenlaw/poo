package LabVIaX;

public class MusicTitle {
	
	private String title;
	private String artist;			
	
	public MusicTitle() {
		this.title = "sem nome";
		this.artist = "sem nome";
	}
	
	public MusicTitle(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}
