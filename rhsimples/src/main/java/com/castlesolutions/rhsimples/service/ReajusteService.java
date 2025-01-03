package com.castlesolutions.rhsimples.service;

import com.castlesolutions.rhsimples.modelo.Desempenho;
import com.castlesolutions.rhsimples.modelo.Funcionario;
import java.math.BigDecimal;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = desempenho.percentualReajuste().multiply(percentual);
		funcionario.reajustarSalario(reajuste);
	}
}
