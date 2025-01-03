package com.castlesolutions.teste;

import com.castlesolutions.modelos.Cliente;
import com.castlesolutions.modelos.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		System.out.println("Testando a classe Cliente");
		Cliente cliente = new Cliente(1, "John Wick", "123.456.789-00", "Desenvolvedor", "Rua 1", "1234-5678");
		System.out.println("Cliente criado:");
		System.out.println(cliente);
		System.out.println();
		System.out.println();
		
		System.out.println("Testando a classe Conta Poupança");
		System.out.println("Criando uma conta para o cliente John Wick");
		ContaPoupanca conta = new ContaPoupanca(1, 1000, 500, cliente);
		System.out.println("Conta criada:");
		System.out.println(conta);
		
		System.out.println("Testando a classe conta corrente");
		System.out.println("Criando uma conta corrente para o cliente John Wick");
		ContaPoupanca contaCorrente = new ContaPoupanca(2, 1000, 500, cliente);
		System.out.println("Conta corrente criada:");
		System.out.println(contaCorrente);
		System.out.println();
		

	}

}
