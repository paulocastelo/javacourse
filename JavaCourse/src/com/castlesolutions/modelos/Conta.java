package com.castlesolutions.modelos;

import java.io.Serializable;

abstract class Conta implements Serializable, Comparable<Conta> {
	
	private static final long serialVersionUID = 1L;
	private static int contador = 1;
	private int id;
	protected double saldo;
	protected double limite;
	private Cliente cliente;
	private double taxa;

	public Conta() {

	}

	public Conta(int id, double saldo, double limite, Cliente cliente) {
		this.id = id;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	// Getters e Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	// Métodos
	
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor de depósito inválido");
		}
		this.saldo += valor;
	}
	
	abstract public void sacar(double valor);
	
	@Override
	public String toString() {
		return "Conta [\nid=" + id + ", \nsaldo=" + saldo + ", \nlimite=" + limite + ", \ncliente vinculado=" + cliente + "]";
	}

	@Override
	public int compareTo(Conta o) {
		return this.id - o.getId();
	}
	
	abstract public boolean Tributavel();
}
