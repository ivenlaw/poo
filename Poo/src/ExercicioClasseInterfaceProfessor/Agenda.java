package ExercicioClasseInterfaceProfessor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Agenda {
	
	private File banco;
	
	public Agenda() {
		banco = new File("banco.txt");
	}
	
	public Contato addContato(Contato contato) throws IOException {
		PrintWriter writer = new PrintWriter(new FileWriter(banco, true),true);
		writer.println(contato);
	//	writer.close();
		return contato;
    }
	
	
	public String buscarContato(String nome) throws Exception {
		Scanner scanner = new Scanner(banco);
		while (scanner.hasNext()) {
			String linha = scanner.nextLine();
			if (linha.contains(nome)) {
				return linha;
			}
	//	scanner.close();
		}
		throw new Exception();
	}

}
