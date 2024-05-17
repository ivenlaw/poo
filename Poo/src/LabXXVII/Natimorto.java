
package LabXXVII;

public class Natimorto extends Pessoa {

	public Natimorto(String nome, Pessoa pai) {
		super("Natimorto "+nome, pai);
	}

	@Override
	public Pessoa addDescendente(String nome, String sexo) {
		throw new RuntimeException("Natimorto não pode ter descendentes");
	}

}
