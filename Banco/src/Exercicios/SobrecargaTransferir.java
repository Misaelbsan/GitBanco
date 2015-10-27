package Exercicios;

public class SobrecargaTransferir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaService operacoesConta = new ContaService();
		Conta conta1 = new Conta();
				
		conta1.setNumero(12345);
		conta1.setSaldo(500.00);
		
		Conta conta2 = new Conta();
		
		conta2.setSaldo(50.00);
				
		Conta conta3 = new Conta();
		
		System.out.println("Transferir 400.00 da conta1 para conta2");
		operacoesConta.transferir(conta1, 400.00, conta2);
		
		System.out.println("Saldo da Conta1 " + conta1.getSaldo());
		System.out.println("Saldo da Conta2 " + conta2.getSaldo());
		System.out.println("Saldo da Conta3 " + conta3.getSaldo());
		
		System.out.println("Transferir 400.00 da conta1 para conta2");
		operacoesConta.transferir(conta1, 200.00, conta2, 300);
		
		System.out.println("Saldo da Conta1 " + conta1.getSaldo());
		System.out.println("Saldo da Conta2 " + conta2.getSaldo());
		System.out.println("Saldo da Conta3 " + conta3.getSaldo());
		
		System.out.println("Transferir 100 da conta1 para conta2");
		operacoesConta.transferir(conta2, 100.00, conta3);
		System.out.println("Saldo da Conta1 " + conta1.getSaldo());
		System.out.println("Saldo da Conta2 " + conta2.getSaldo());
		System.out.println("Saldo da Conta3 " + conta3.getSaldo());
	}

}
