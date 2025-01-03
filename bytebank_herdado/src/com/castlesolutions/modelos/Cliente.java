package com.castlesolutions.modelos;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private String profissao;
	private String endereco;
	private String telefone;

	public Cliente() {

	}

	public Cliente(int id, String nome, String cpf, String profissao, String endereco, String telefone) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", profissao=" + profissao + ", endereco="
				+ endereco + ", telefone=" + telefone + "]";
	}

}
