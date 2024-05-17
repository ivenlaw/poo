package LabXXVII;

import java.util.Random;

public class Filha extends Pessoa {

	public Filha(String nome, Pessoa pai) {
		super("Sra. "+nome, pai);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pessoa addDescendente(String nome, String sexo) {
		Pessoa nova=null;
		Random r = new Random();
		if(sexo.equals("M")) {
			if(r.nextBoolean()) {
                nova=new Filho(nome, this);
			}else {
				nova=new Natimorto(nome, this);
			}
		}else {
            nova=new Filha(nome, this);
		}
		return nova;
	}

}
