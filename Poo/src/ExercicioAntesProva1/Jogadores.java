package ExercicioAntesProva1;

public class Jogadores extends Pessoa {
	
	private String posicaoEmCampo;
	private int nrDaCamisa;
	private int golsMarcados;
	
	public Jogadores(String nome, int idade, String nacionalidade, double salario, String posicaoEmCampo,
			int nrDaCamisa, int golsMarcados) {
		super(nome, idade, nacionalidade, salario);
		this.posicaoEmCampo = posicaoEmCampo;
		this.nrDaCamisa = nrDaCamisa;
		this.golsMarcados = golsMarcados;
	}

	@Override
	public void descricao() {
		// TODO Auto-generated method stub
		super.descricao();
		System.out.println(" Posição em Campo: " + this.posicaoEmCampo + " Número da Camisa: " + this.nrDaCamisa + " Gols marcados na temporada: " + this.golsMarcados);
	}
	

	


}
