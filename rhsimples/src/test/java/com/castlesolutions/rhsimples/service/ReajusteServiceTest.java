package com.castlesolutions.rhsimples.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.castlesolutions.rhsimples.modelo.Desempenho;
import com.castlesolutions.rhsimples.modelo.Funcionario;

public class ReajusteServiceTest {

    private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		service = new ReajusteService();
		funcionario = new Funcionario("João", new BigDecimal("1000"), LocalDate.of(2020, 1, 1));
	}


	@Test
    public void deveAplicarAumentoDe3PorCentoParaDesempenhoADesejar() {
//		inicializar();
//       Funcionario funcionario = new Funcionario("João", new BigDecimal("1000"), LocalDate.of(2020, 1, 1)); --> foi inicializado no método inicializar()
//		ReajusteService service = new ReajusteService();
//    	service = new ReajusteService();
    	service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(0, new BigDecimal("1030").compareTo(funcionario.getSalario()));
    }

	@Test
	public void deveAplicarAumentoDe15PorCentoParaDesempenhoBom() {
//		inicializar();
//		Funcionario funcionario = new Funcionario("Maria", new BigDecimal("2000"), LocalDate.of(2018, 5, 10));
//		ReajusteService service = new ReajusteService();
		funcionario.setSalario(new BigDecimal("2000"));
		service.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(0, new BigDecimal("2300").compareTo(funcionario.getSalario()));
	}

    @Test
    public void deveAplicarAumentoDe20PorCentoParaDesempenhoOtimo() {
//    	inicializar();
//        Funcionario funcionario = new Funcionario("Carlos", new BigDecimal("3000"), LocalDate.of(2015, 7, 20));
//    	ReajusteService service = new ReajusteService();
        funcionario.setSalario(new BigDecimal("3000"));
    	service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(0, new BigDecimal("3600").compareTo(funcionario.getSalario()));
    }
}
