package empresa;

public class Empregado extends Pessoa{

	public Empregado(String nome, Pessoa chefe) {
		super(nome, chefe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pessoa addSubordinado(Pessoa pessoa) throws EmpregadoNaoTemSubordinadoException {
		// TODO Auto-generated method stub
		throw new EmpregadoNaoTemSubordinadoException();
	}

}
