package ExercicioAntesProva1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Equipe equipe = new Equipe();
		
		Jogadores jogador1 = new Jogadores("Rafael Lima ", 20, " argentino ", 14500, " atacante", 10, 4);
		Jogadores jogador2 = new Jogadores("Marcos Silva ", 19, " brasileiro ", 12500, " goleiro", 45, 0);
		Jogadores jogador3 = new Jogadores("Filipe Smith ", 22, " norte americano ", 16000, " lateral", 16, 2);
		
		Treinadores treinador = new Treinadores("Francisco Peixoto ", 45, " ucraniano ", 25000, 15, "4-2-4");
		 
		equipe.adicionarTreinador(treinador);
		equipe.adicionarJogadores(jogador1);
		equipe.adicionarJogadores(jogador2);
		equipe.adicionarJogadores(jogador3);
		
		equipe.imprimirEquipe();
		
		
		
	}

}
