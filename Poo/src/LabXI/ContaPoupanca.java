package LabXI;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

	private Double tarifaMensal = 1.00;
	private LocalDate ultimaDataAtualizada;
	private String tipoPoupanca;
	
	public ContaPoupanca(String nrConta, double saldo) {
		super(nrConta, saldo);
		// TODO Auto-generated constructor stub
		this.tipoPoupanca = "p";
		this.ultimaDataAtualizada = LocalDate.now();
	}

	public void atualizarSaldo(Conta nrConta) {
		LocalDate hoje = LocalDate.now();
		int mesesPassados = nrConta.getDataAbertura().until(hoje).getMonths();
		Double saldoAtualizado = nrConta.getSaldo();
		
		if (mesesPassados>0 && ultimaDataAtualizada == nrConta.getDataAbertura()) {
			for (int i = 0; i < mesesPassados; i++) {
				saldoAtualizado += (nrConta.getSaldo() - this.tarifaMensal);
				nrConta.setSaldo(saldoAtualizado);
			}
			ultimaDataAtualizada=hoje;
		} else if (mesesPassados>0 && ultimaDataAtualizada != nrConta.getDataAbertura()) {
			int mesesPassadosAtualizado = ultimaDataAtualizada.until(hoje).getMonths();
			for (int i = 0; i < mesesPassadosAtualizado; i++) {
				saldoAtualizado += (nrConta.getSaldo() - this.tarifaMensal);
				nrConta.setSaldo(saldoAtualizado);
			}
			ultimaDataAtualizada=hoje;
		}
		
	}
}
