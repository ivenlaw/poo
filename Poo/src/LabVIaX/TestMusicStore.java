package LabVIaX;

public class TestMusicStore {

	public static void main(String[] args) {
		
		MusicStore musicStore = new MusicStore();
		
		musicStore.displayHoursOfOperation();
		musicStore.setOwner("Joel Santana, proprietário");
		
		System.out.println(musicStore.getOwner());
		
		
	}
}
