package com.castlesolutions.modelos;

public class ContaCorrente extends Conta {
	
	private double taxa = 0.01;

	public ContaCorrente() {
	}

	public ContaCorrente(int id, double saldo, double limite, Cliente cliente) {
		super(id, saldo, limite, cliente);
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
		
		this.saldo -= valor + (valor + taxa);
	}
	
	@Override
	public boolean Tributavel() {
		return true;
	}
	

}
