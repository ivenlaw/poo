package LabIII;

public class A {
	
	public static void main(String[] args) {
	
		int[] vetorInteiros = new int[5];
		String objetosString[] = {"Zé", "Joao", "Tonho"};
		int i = 0;
		int a = 19;
		
		while(i<5) {
			vetorInteiros[i] = a;
			a *= 2;
			i++;
		}
		
		for(int j=0; j<5; j++) {
			System.out.println("vetor inteiros[" + j + "] = " + vetorInteiros[j]);
		}
		
		for(int k=0; k<3; k++) {
			System.out.println("vetor string[" + k + "] = " + objetosString[k]);
		}
		
		objetosString[0]="Maria";
		
		for(int k=0; k<3; k++) {
			System.out.println("vetor string[" + k + "] = " + objetosString[k]);
		}
	}
	
}
