package LabVIaX;

import java.util.Scanner;

public class TestMusicStore {

	public static void main(String[] args) {
		
		MusicStore musicStore = new MusicStore();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a hora de abertura da loja:");
		musicStore.setOpenTime(scanner.nextInt());
		System.out.println("Entre com a hora de fechamento da loja:");
		musicStore.setCloseTime(scanner.nextInt());
		
		scanner.nextLine();  // Consumir a nova linha
				
		System.out.println("Digite o titulo da primeira música:");
		String titulo1 = scanner.nextLine();
		System.out.println("Digite o nome do artista que canta esta música:");
		String artista1 = scanner.nextLine();
		
		System.out.println("Digite o titulo da segunda música:");
		String titulo2 = scanner.nextLine();
		System.out.println("Digite o nome do artista que canta esta música:");
		String artista2 = scanner.nextLine();
		
		MusicTitle musicTitle1 = new MusicTitle(titulo1, artista1);
		MusicTitle musicTitle2 = new MusicTitle(titulo2, artista2);
		scanner.close();	

		
	//	MusicStore musicStore2 = new MusicStore();
		MusicTitle[] titlesStore = {musicTitle1, musicTitle2};
	//	musicStore2.setTitles(titles);
		musicStore.setTitlesStore(titlesStore);
	//	musicStore2.displayMusicTitles();
		
		
		musicStore.setOwner("Joel Santana");
		musicStore.displayHoursOfOperation();
		musicStore.displayMusicTitles();
	}
}
