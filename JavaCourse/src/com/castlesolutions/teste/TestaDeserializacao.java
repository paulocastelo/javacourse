package com.castlesolutions.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.castlesolutions.modelos.Cliente;
import com.castlesolutions.modelos.ContaPoupanca;
import com.castlesolutions.modelos.ContaCorrente;

public class TestaDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// Deserializando um objeto Cliente
		System.out.println("Informações do cliente:");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente);
		System.out.println();
		
		System.out.println("Informações da conta poupanca:");
		// Deserializando um objeto Conta
		ois = new ObjectInputStream(new FileInputStream("contaPoupanca.bin"));
		ContaPoupanca contaPoupanca = (ContaPoupanca) ois.readObject();
		ois.close();
		System.out.println(contaPoupanca);
		

		
		System.out.println("Informações da conta corrente:");
		// Deserializando um objeto Conta
		ois = new ObjectInputStream(new FileInputStream("contaCorrente.bin"));
		ContaCorrente contaCorrente = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(contaPoupanca);
		
	}
}