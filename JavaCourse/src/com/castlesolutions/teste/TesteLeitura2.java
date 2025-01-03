
package com.castlesolutions.teste;

import java.io.File;
import java.text.NumberFormat;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"));
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			// System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");

			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int conta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			String saldoStr = linhaScanner.next();
			double saldo = Double.parseDouble(saldoStr);

			// Formata o saldo como moeda brasileira
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			String saldoFormatado = nf.format(saldo);

			System.out.print("\nValores da linha:");
			String StringFormat = "\t\nTipo: %s, \t\nAgencia/Conta: %04d-%06d, \t\nTitular: %s, \t\nSaldo: %s";
			System.out.println(String.format(StringFormat, tipo, agencia, conta, titular, saldoFormatado));
			linhaScanner.close();
		}
		scanner.close();
	}
}
