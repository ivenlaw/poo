package ExercicioAntesProva1;

public class Treinadores extends Pessoa {
	
	private int anosDeExperiencia;
	private String sistemaTatico;
	
	public Treinadores(String nome, int idade, String nacionalidade, double salario, int anosDeExperiencia,
			String sistemaTatico) {
		super(nome, idade, nacionalidade, salario);
		this.anosDeExperiencia = anosDeExperiencia;
		this.sistemaTatico = sistemaTatico;
	}

	@Override
	public void descricao() {
		// TODO Auto-generated method stub
		super.descricao();
		System.out.println(" Anos de experiência: " + this.anosDeExperiencia + " Sistema tático preferido: " + this.sistemaTatico);
	}
	
	
}
