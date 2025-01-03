package com.castlesolutions.modelos;

public class ContaPoupanca extends Conta {
	
	private double taxa = 0.0;

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(int id, double saldo, double limite, Cliente cliente) {
		super(id, saldo, limite, cliente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double valor) {

		if (valor > this.limite) {
			throw new IllegalArgumentException("Valor de saque excede o limite da conta");
		}
		if (valor > this.saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para saque");
		}
		if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido");
		}
		
		this.saldo -= valor;
	}
	
	@Override
	public boolean Tributavel() {
		return false;
	}
	

}
