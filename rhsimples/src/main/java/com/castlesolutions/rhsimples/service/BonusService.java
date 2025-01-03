package com.castlesolutions.rhsimples.service;

import java.math.BigDecimal;

import com.castlesolutions.rhsimples.modelo.Funcionario;

public class BonusService {
    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal bonus = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (bonus.compareTo(new BigDecimal("1000")) > 0) {
            return BigDecimal.ZERO;
        }
        return bonus;
    }
}
