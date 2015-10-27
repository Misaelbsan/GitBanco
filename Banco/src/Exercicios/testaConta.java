package Exercicios;

import java.util.Scanner;

public class testaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);
		
	System.out.println("Digite o saldo inicial da Conta: ");
	double saldoConta = c.nextDouble();
	
	System.out.println("Digite o numero da Conta: ");
	int numeroConta = c.nextInt();
	
	ContaService operacoesConta = new ContaService();
	
	Conta conta1 = new Conta();
	Conta conta2 = new Conta();
	Conta conta3 = new Conta();
	
		conta1.setNumero(numeroConta);
		conta1.setSaldo(saldoConta);
		
	System.out.println("O numero da Conta 1 : " + conta1.getNumero());
	System.out.println("O saldo da Conta 1 : " + conta1.getSaldo());
	System.out.println("Será creditado 100 reais na conta");
		operacoesConta.depositar(conta1, 100.00);
	System.out.println("Saldo da Conta1 : " + conta1.getSaldo());
	
	System.out.println("Será debitado 56.43 reais da conta");
	operacoesConta.sacar(conta1, 56.43);
	System.out.println("Saldo da Conta1: " + conta1.getSaldo());
	System.out.println("");
	System.out.println("Saldo da Conta1: " + conta1.getSaldo());
	System.out.println("Saldo da Conta2: " + conta2.getSaldo());
	System.out.println("Saldo da Conta3: " + conta3.getSaldo());
	System.out.println("");
	System.out.println("Tranferir 50.00 da conta1 para conta2");
		operacoesConta.transferir(conta1, 50.00, conta2);
	System.out.println("");
	System.out.println("Saldo da Conta1: " + conta1.getSaldo());
	System.out.println("Saldo da Conta2: " + conta2.getSaldo());
	System.out.println("Saldo da Conta3: " + conta3.getSaldo());
	System.out.println("Tranferir 100.23 da conta2 para conta3");
		operacoesConta.transferir(conta2, 100.23, conta3);
	System.out.println("");
	System.out.println("Saldo da Conta1: " + conta1.getSaldo());
	System.out.println("Saldo da Conta2: " + conta2.getSaldo());
	System.out.println("Saldo da Conta3: " + conta3.getSaldo());
		
	
	
	}

}

