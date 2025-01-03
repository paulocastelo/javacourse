package com.castlesolutions.rhsimples.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.castlesolutions.rhsimples.modelo.Funcionario;

public class BonusServiceTest {

    @Test
    public void deveCalcularBonusCorretamente() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(new BigDecimal("2500"));
        funcionario.setDataAdmissao(java.time.LocalDate.of(2020, 1, 1));

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(funcionario);

        assertEquals(new BigDecimal("250.0"), bonus);
    }

    @Test
    public void deveRetornarZeroParaBonusAcimaDeMil() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setSalario(new BigDecimal("15000"));
        funcionario.setDataAdmissao(java.time.LocalDate.of(2015, 5, 10));

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(funcionario);

        assertEquals(BigDecimal.ZERO, bonus);
    }
    
    @Test
	public void deveCalcularBonusParaSalarioIgualADezMil() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setSalario(new BigDecimal("10000"));
        funcionario.setDataAdmissao(java.time.LocalDate.of(2015, 5, 10));

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(funcionario);

        assertEquals(new BigDecimal("1000.0"), bonus);
    }
}
