package Exercicios;

public class ContaService {
	public void depositar(Conta contaDestino, double valor){
		contaDestino.setSaldo(contaDestino.getSaldo() + valor );
	}
	
	public void sacar(Conta contaSaque, double valor){
		contaSaque.setSaldo(contaSaque.getSaldo() - valor);
	}
	public void transferir(Conta contaSaque, double valor, Conta contaDestino){
		transferir(contaSaque, valor, contaDestino, 0);
	}
	public void transferir(Conta contaSaque, double valor, Conta contaDestino, double limite){
		if((contaSaque.getSaldo() + limite) < valor){
			System.out.println("Saldo Insuficiente para esta operação");
		return;
	}
	this.sacar(contaSaque, valor);
	this.depositar(contaDestino, valor);

		
	
	}
	
}


