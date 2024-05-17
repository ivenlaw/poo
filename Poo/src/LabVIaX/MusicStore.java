package LabVIaX;

import java.util.Calendar;

public class MusicStore {
	
	private String owner = "sem dono";
	private int openTime;
	private int closeTime;
	private MusicTitle[] titlesStore;
	
    public MusicStore() {
 
    }
	
	public MusicStore(String owner) {
		this.owner = owner;
		this.titlesStore = null;
	}
	
	@Override
	public String toString() {
		return "[Dono = " + owner + ", Abre = " + openTime + ", Fecha = " + closeTime + "]";
	}

	public void displayHoursOfOperation() {
		System.out.println("Período:");
		System.out.println(this.toString());
	}
	
    public boolean isOpen() {
        int horaAtual = getHourInt();
        return horaAtual >= openTime && horaAtual < closeTime;
    }
	
	public String getOpenClosedMessage() {
		return isOpen() ? "Estamos Abertos!" : "Estamos Fechados!";
	}
	
	public int getHourInt() { 
		Calendar c = Calendar.getInstance(); 
		return c.get(Calendar.HOUR_OF_DAY); 
		} 

    public void displayMusicTitles() {
        if (titlesStore == null) {
            System.out.println("Não há títulos de música disponíveis.");
            return;
        }else {
        	for (int i = 0; i < titlesStore.length; i++) {
                System.out.println("Título " + (i + 1) + ":");
                System.out.println("Título: " + titlesStore[i].getTitle());
                System.out.println("Artista: " + titlesStore[i].getArtist());
            }
        }
    }
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public int getOpenTime() {
		return openTime;
	}

	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}

	public int getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}

	public MusicTitle[] getTitlesStore() {
		return titlesStore;
	}

	public void setTitlesStore(MusicTitle[] titlesStore) {
		this.titlesStore = titlesStore;
	}
	
}
