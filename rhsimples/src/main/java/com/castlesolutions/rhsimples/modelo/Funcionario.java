package com.castlesolutions.rhsimples.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private BigDecimal salario;
    private LocalDate dataAdmissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste).setScale(2);
		
	}
}
