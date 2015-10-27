package Exercicios;

import java.util.Date;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private Date dataAbertura;
	
	public Conta(){
		this.dataAbertura = new Date();
		
		System.out.println("Data de Abertura da conta:" + this.dataAbertura.toString());	
	}
	public Conta(String nome, int nconta){
		this();
		numero = nconta;
		titular = nome;
		saldo = 0.0;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
	
}
