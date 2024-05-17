package LabXXVII;

public abstract class Pessoa {
	
	private String nome;
	private Pessoa descendentes[];
	private Pessoa pai;
	
	public Pessoa(String nome, Pessoa pai) {
		this.nome = nome;
		this.pai = pai;
		this.descendentes = new Pessoa[10];
	}
	
	public Pessoa getPai() {
		return pai;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQuantidadeDescendentes() {
        int quantidade = 0;
        for (Pessoa p : descendentes) {
            if (p != null) {
                quantidade++;
            }
        }
        return quantidade;
    }
	
	public Pessoa findDescendente(String nome) {
		
		if (this.nome.equals(nome)) {
			return this;
		} else {
			for (Pessoa p : descendentes) {
				if (p != null) {
					Pessoa result = p.findDescendente(nome);
					if (result != null) {
						return result;
					}
				}
			}
		}
		 throw new RuntimeException("Pessoa não encontrada");
	}
	
	
	public void listarAscendentes() {
		System.out.println(this.nome);
		if (pai != null) {
			pai.listarAscendentes();
		}
	}
	
	public abstract Pessoa addDescendente(String nome, String sexo);

}
