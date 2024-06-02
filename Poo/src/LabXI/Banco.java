package LabXI;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List <Cliente> titular;

	public Banco() {
		this.titular = new ArrayList<>();
	}

	public void adicionarCliente(Cliente cliente) {
        this.titular.add(cliente);
    }

    public List<Cliente> getTitulares() {
        return titular;
    }
	
	public Cliente buscarTitular(String nome) {
		for (Cliente cliente : titular) {
			if(cliente != null && cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		return null;
	}
	
	public Conta buscarPorNumeroConta (String numero) {
		for (Cliente cliente : titular) {
			if (cliente != null && cliente.getConta().getNrConta().equals(numero)) {
				return cliente.getConta();
			}
		}
		return null;
	}
	
	public double saldoTotalDoBanco () {
		double total = 0;
		for (Cliente cliente : titular) {
			if(cliente != null) {
				total += cliente.getConta().getSaldo();
			}
		}
		return total;
	}
	
}
