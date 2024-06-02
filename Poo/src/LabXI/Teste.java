package LabXI;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta novaConta = new Conta();
		Banco novoBanco = new Banco();
		
		String opcao = "0";
		Scanner scanner = new Scanner (System.in);
		
		try {
			while (!opcao.equals("5")) {
				System.out.println("""
						Banco Java.
						Como podemos auxiliar:
						1 - Abertura de Conta
						2 - Depósito
						3 - Saque
						4 - Consulta de saldo
						5 - Encerrar atendimento
						""");
				opcao = scanner.nextLine();
				switch (opcao) {
				case "1" -> {
					novaConta.aberturaConta(novoBanco);
				}
				case "2" -> {
					System.out.println("Qual o número da conta de depósito?");
					String numeroConta = scanner.nextLine();
					System.out.println("Qual o valor a depositar?");
					double valorDeposito = scanner.nextDouble();
					scanner.nextLine(); // Consumir a nova linha
					novaConta.depositar(novoBanco.buscarPorNumeroConta(numeroConta), valorDeposito);
				}
				case "3" -> {
					System.out.println("Qual o número da conta para saque?");
					String numeroConta = scanner.nextLine();
					System.out.println("Qual o valor a retirar?");
					double valorSaque = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha
					novaConta.sacar (novoBanco.buscarPorNumeroConta(numeroConta), valorSaque);
				}
				case "4" -> {
					System.out.println("Informe o número da conta para obter saldo:");
					String numeroConta = scanner.nextLine();
					System.out.println("Informe 'c' para conta corrente ou 'p' para conta poupanca:");
					String tipoConta = scanner.nextLine();
					novaConta.consultarSaldo(tipoConta,novoBanco.buscarPorNumeroConta(numeroConta));
				}
				case "5" -> {
					System.out.println("Encerrando atendimento.");
				}
				default -> throw new IllegalArgumentException("Opção inesperada: " + opcao);
				}	
			}
	} catch (NoSuchElementException e) {
		System.out.println("Erro ao ler a entrada: " + e.getMessage());
		e.printStackTrace();
	}  finally {
		scanner.close();
	}
	}
}
