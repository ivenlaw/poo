package LabVIaX;

import java.util.Calendar;

public class MusicStore {
	
	private String owner = "sem dono";
	private int openTime;
	private int closeTime;
	
    public MusicStore() {
        this.openTime = 9;  
        this.closeTime = 21; 
    }
	
	public void displayHoursOfOperation() {
		System.out.println("Período: \n");
		System.out.println(getOpenClosedMessage());
		System.out.println("\nDiariamente das 9:00 - 21:00");
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
	
}
