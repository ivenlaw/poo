package LabXI;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Conta {
	
	private String nrConta;
	private double saldo;
	private LocalDate dataAbertura;
	private ContaCorrente contaCorrente;
	private ContaPoupanca contaPoupanca;
	
	public Conta(String nrConta, double saldo) {
		this.nrConta = nrConta;
		this.saldo = saldo;
		this.dataAbertura = LocalDate.now();
	}
	
	public Conta() {
	}

	public void depositar (Conta nrConta, double valor) {
		try {
			nrConta.saldo +=valor;
			System.out.println("Depósito de " + valor + " realizado com sucesso. Saldo atual: " + nrConta.saldo);
		} catch (NoSuchElementException e) {
	            System.out.println("Erro ao ler a entrada: " + e.getMessage());
		}
	}
	
	public void sacar (Conta nrConta, double valor) {
		try {
			if (nrConta.saldo>=valor) {
				nrConta.saldo -= valor;
				System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + nrConta.saldo);
			} else {
				System.out.println("Saque não efetuado, saldo insuficiente.");
			}
		} catch (NoSuchElementException e) {
            System.out.println("Erro ao ler a entrada: " + e.getMessage());
		}
	}
	
	public void consultarSaldo(String tipo, Conta nrConta) {
		if (tipo.equals("c")) {
			contaCorrente.atualizarSaldo(nrConta);
			System.out.println("O saldo da conta corrente " + nrConta.nrConta + " é " + nrConta.saldo);
		} else if (tipo.equals("p")) {
			contaPoupanca.atualizarSaldo(nrConta);
	          System.out.println("O saldo da conta poupança " + nrConta.nrConta + " é " + nrConta.saldo);
		} else {
            System.out.println("Tipo de conta inválido.");
        }
	}

	public void aberturaConta(Banco banco) {
		Scanner scanner = new Scanner (System.in);
		try  {
			System.out.println("Vamos a abertura de sua conta!");
			System.out.println("""
					Escolha uma opção, você irá abrir uma?
					1 - Conta Corrente
					2 - Conta Poupança
					""");
			String opcao = scanner.nextLine();
			Random nrAleatorio = new Random();
			String numero = Integer.toString(nrAleatorio.nextInt(10000));
			System.out.println("Digite o nome do titular: ");
			String titular = scanner.nextLine();
			System.out.println("Qual o valor do depósito inicial?");
            if (!scanner.hasNextDouble()) {
                throw new IllegalStateException("O valor do depósito inicial deve ser um número.");
            }
			double saldoInicial = scanner.nextDouble();
			scanner.nextLine(); // Consome a nova linha para evitar problemas com próximas leituras
	//		Banco banco = new Banco();
			
			switch (opcao) {
				case "1"-> { 
					System.out.println("Sua conta corrente será aberta!");
					Cliente cliente = new Cliente (titular, (new ContaCorrente(numero, saldoInicial)));	
					banco.adicionarCliente(cliente);
					System.out.println(cliente.toString());
				}
				case "2"-> {
					System.out.println("Sua conta poupança será aberta!");
					Cliente cliente = new Cliente (titular, (new ContaPoupanca(numero, saldoInicial)));
					banco.adicionarCliente(cliente);
					System.out.println(cliente.toString());
				}
				default -> throw new IllegalArgumentException("Opção inesperada: " + opcao);
			}
		} catch (NoSuchElementException e) {
            System.out.println("Erro ao ler a entrada: " + e.getMessage());
        }//finally {
	 //       scanner.close();
//	    }
	}

	public String getNrConta() {
		return nrConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
