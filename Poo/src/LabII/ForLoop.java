package LabII;

public class ForLoop {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Oi");
		}
		
		int soma = 0;
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                soma++;
            }
		}
		System.out.println(soma);
	}
}