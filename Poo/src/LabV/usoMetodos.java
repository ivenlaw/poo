package LabV;

public class usoMetodos {

	public static void welcome() {
		System.out.println("Seja Bem Vindo!!!");
	}
	
	public static int addTwo(int num) {
		return num +=2;
	}
	
	public static void main(String[] args) {
		int i = 3;
		welcome();
		
		System.out.println("addTwo(" + i + ") é " + addTwo(i)); 
		
		i=19;
		
		System.out.println("addTwo(" + i + ") é " + addTwo(i)); 
		
	}
}
