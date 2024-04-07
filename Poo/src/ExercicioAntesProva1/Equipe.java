package ExercicioAntesProva1;

import java.util.ArrayList;

public class Equipe {
	
	private ArrayList<Pessoa> equipe;
	
	public Equipe() {
		equipe = new ArrayList<Pessoa>(); 
	}

	public void adicionarJogadores(Jogadores jogador) {
		equipe.add(jogador);
	}

	public void adicionarTreinador(Treinadores treinador) {
		equipe.add(treinador);
	}
	
	public void imprimirEquipe() {
		for(Pessoa eq : equipe) {
			eq.descricao();
		}
	}
}
