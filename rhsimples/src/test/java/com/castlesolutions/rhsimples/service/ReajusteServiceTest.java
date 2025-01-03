package com.castlesolutions.rhsimples.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.castlesolutions.rhsimples.modelo.Desempenho;
import com.castlesolutions.rhsimples.modelo.Funcionario;

public class ReajusteServiceTest {

    @Test
    public void deveAplicarAumentoDe3PorCentoParaDesempenhoADesejar() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(new BigDecimal("1000"));
        funcionario.setDataAdmissao(LocalDate.of(2020, 1, 1));

        ReajusteService service = new ReajusteService();
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(0, new BigDecimal("1030").compareTo(funcionario.getSalario()));
    }

	@Test
	public void deveAplicarAumentoDe15PorCentoParaDesempenhoBom() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Maria");
		funcionario.setSalario(new BigDecimal("2000"));
		funcionario.setDataAdmissao(LocalDate.of(2018, 5, 10));

		ReajusteService service = new ReajusteService();
		service.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(0, new BigDecimal("2300").compareTo(funcionario.getSalario()));
	}

    @Test
    public void deveAplicarAumentoDe20PorCentoParaDesempenhoOtimo() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Carlos");
        funcionario.setSalario(new BigDecimal("3000"));
        funcionario.setDataAdmissao(LocalDate.of(2015, 7, 20));

        ReajusteService service = new ReajusteService();
        service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(0, new BigDecimal("3600").compareTo(funcionario.getSalario()));
    }
}
