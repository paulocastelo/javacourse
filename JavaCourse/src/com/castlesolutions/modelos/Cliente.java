package com.castlesolutions.modelos;

import java.io.Serializable;

public class Cliente implements Serializable, Comparable<Cliente> {

	private static final long serialVersionUID = 1L;
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
	
	// Getters e Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [\nid=" + id + ", \nnome=" + nome + ", \ncpf=" + cpf + ", \nprofissao=" + profissao + ", \nendereco="
				+ endereco + ", \ntelefone=" + telefone + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		return this.nome.compareTo(o.getNome());
	}

}
