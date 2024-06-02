package LabXI;

public class Cliente {

	private String nome;
	private Conta conta;
		
	public Cliente(String nome, Conta Conta) {
		this.nome = nome;
		this.conta = Conta;
	}

	public String getNome() {
		return nome;
	}
	
	public Conta getConta() {
		return conta;
	}

	@Override
	public String toString() {
		return "Cliente [Titular=" + nome + ", Conta=" + conta.getNrConta() + ", Saldo= R$ " +  conta.getSaldo() + "]";
	}
	
	
}
