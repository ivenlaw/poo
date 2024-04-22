package LabIV;

import java.util.Scanner;

public class usoIf {

	private static int quente = 40;
	private static int frio = 10;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a temperatura atual: \n");
		int tempAtual = scanner.nextInt();

		System.out.println("A temperatura atual é :" + tempAtual);
		
		if(tempAtual == frio) {
			System.out.println("FRIO");
		} else if(tempAtual == quente) {
			System.out.println("QUENTE");
		} else if (frio<tempAtual && tempAtual<quente) {
			System.out.println("Normal");
		} else if (tempAtual<frio || tempAtual>quente) {
			System.out.println("Temperatura extrema");
		}
		scanner.close();
	}
}