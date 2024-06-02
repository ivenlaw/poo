package LabXI;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

	private Double taxaMensal = 0.01;
	private LocalDate ultimaDataAtualizada;
	private String tipoCorrente;
	
	public ContaCorrente(String nrConta, double saldo) {
		super(nrConta, saldo);
		// TODO Auto-generated constructor stub
		this.tipoCorrente = "c";
		this.ultimaDataAtualizada = LocalDate.now();
	}

	public void atualizarSaldo(Conta nrConta) {
		LocalDate hoje = LocalDate.now();
		int mesesPassados = nrConta.getDataAbertura().until(hoje).getMonths();
		Double saldoAtualizado = nrConta.getSaldo();
		
		if (mesesPassados>0 && ultimaDataAtualizada == nrConta.getDataAbertura()) {
			for (int i = 0; i < mesesPassados; i++) {
				saldoAtualizado += (nrConta.getSaldo() * this.taxaMensal);
				nrConta.setSaldo(saldoAtualizado);
			}
			ultimaDataAtualizada=hoje;
		} else if (mesesPassados>0 && ultimaDataAtualizada != nrConta.getDataAbertura()) {
			int mesesPassadosAtualizado = ultimaDataAtualizada.until(hoje).getMonths();
			for (int i = 0; i < mesesPassadosAtualizado; i++) {
				saldoAtualizado += (nrConta.getSaldo() * this.taxaMensal);
				nrConta.setSaldo(saldoAtualizado);
			}
			ultimaDataAtualizada=hoje;
		}
		
	}
	
}
