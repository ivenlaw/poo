package ExercicioAntesProva1;

public class Pessoa {

	private String nome;
	private int idade;
	private String nacionalidade;
	private double salario;
	
	public Pessoa(String nome, int idade, String nacionalidade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
		this.salario = salario;
	}
	
	public void descricao() {
		System.out.println("Nome: " + this.nome + " Idade: " + this.idade + " Nacionalidade: " + this.nacionalidade + " Salário: R$ " + this.salario);
	}
}
