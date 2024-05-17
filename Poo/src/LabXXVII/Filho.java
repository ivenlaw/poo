package LabXXVII;

public class Filho extends Pessoa{

	public Filho(String nome, Pessoa pai) {
		super("Sr. "+nome, pai);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pessoa addDescendente(String nome, String sexo) {
		Pessoa nova=null;
		if(this.getQuantidadeDescendentes()==1) {
			nova=new Natimorto(nome, this);
		}else if(sexo.equals("M")) {
            nova=new Filho(nome, this);
            }else {
            	nova=new Filha(nome, this);
            }
		return nova;
	}

}
