package empresa;

import java.util.ArrayList;

public abstract class Pessoa {

	private String nome;
	private Pessoa chefe;
	protected ArrayList<Pessoa> subordinados;
	
	public Pessoa(String nome, Pessoa chefe) {
		this.nome = nome;
		this.chefe = chefe;
		this.subordinados = new ArrayList<Pessoa>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public Pessoa getChefe() {
		return chefe;
	}
	
	public abstract Pessoa addSubordinado(Pessoa pessoa)throws EmpregadoNaoTemSubordinadoException ;
	
	public Pessoa findPessoaByNome(String nome) {
		if (this.nome.equals(nome)) {
			return this;
		}
		for (Pessoa p : subordinados) {
			Pessoa pessoa = p.findPessoaByNome(nome);
			if (pessoa != null) {
				return pessoa;
			}
		}
		return null;
	}
	
	public void listarSubordinados() {
		for (Pessoa p : subordinados) {
			System.out.println(p.getNome());
			p.listarSubordinados();
		}
	}
	
	public void listarSuperiores() {
		if (chefe != null) {
			System.out.println(chefe.getNome());
			chefe.listarSuperiores();
		}
	}
	
}
