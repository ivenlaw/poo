package empresa;

import java.util.ArrayList;

public class Empresa {

	private Pessoa presidente;
	private ArrayList<Pessoa> chefes;
	private ArrayList<Pessoa> empregados;
	
	public Empresa(Pessoa presidente) {
		this.presidente = presidente;
		this.chefes = new ArrayList<Pessoa>();
		this.empregados = new ArrayList<Pessoa>();
	}
	
	public Pessoa getPresidente() {
		return presidente;
	}
	
	private void addChefe(Pessoa chefe) {
		this.chefes.add(chefe);
	}
	
	private void addEmpregado(Pessoa empregado) {
		this.empregados.add(empregado);
	}
	
	public Pessoa addFuncionario(String nomeChefe, Pessoa funcionario) {
		Pessoa chefe=presidente.findPessoaByNome(nomeChefe);
		if ((chefe!=null)) {
			try {
				chefe.addSubordinado(funcionario);
				if (funcionario instanceof Chefe) {
					addChefe(funcionario);
				} else {
					addEmpregado(funcionario);
				}
			} catch (EmpregadoNaoTemSubordinadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return funcionario;
		}
		return null;
	} 
	
}
