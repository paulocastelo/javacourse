package com.castlesolutions.rhsimples.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import com.castlesolutions.rhsimples.modelo.Funcionario;

public class BonusServiceTest {

	@Test
	public void deveCalcularBonusCorretamente() {
		BonusService service = new BonusService();
		BigDecimal bonus = service
				.calcularBonus(new Funcionario("João", new BigDecimal("2500"), java.time.LocalDate.of(2020, 1, 1)));

		assertEquals(new BigDecimal("250.0"), bonus);
	}

	@Test
	public void deveRetornarZeroParaBonusAcimaDeMil() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, () -> service
				.calcularBonus(new Funcionario("Paulo", new BigDecimal("250000"), java.time.LocalDate.of(2016, 1, 1))));

//		try {
//			service.calcularBonus(
//					new Funcionario("Paulo", new BigDecimal("250000"), java.time.LocalDate.of(2016, 1, 1)));
//		} catch (IllegalArgumentException e) {
//			assertEquals("Funcionário com salário acima de R$ 10.000,00 não pode receber bônus.", e.getMessage());
//		}

	}

	@Test
	public void deveCalcularBonusParaSalarioIgualADezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service
				.calcularBonus(new Funcionario("Joana", new BigDecimal("10000"), java.time.LocalDate.of(2015, 5, 10)));

		assertEquals(new BigDecimal("1000.0"), bonus);

	}
}
