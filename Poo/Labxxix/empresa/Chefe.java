package empresa;

public class Chefe extends Pessoa{

	public Chefe(String nome, Pessoa chefe) {
		super(nome, chefe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pessoa addSubordinado(Pessoa pessoa) throws EmpregadoNaoTemSubordinadoException {
		// TODO Auto-generated method stub
		this.subordinados.add(pessoa);
		return pessoa;
	}

}
