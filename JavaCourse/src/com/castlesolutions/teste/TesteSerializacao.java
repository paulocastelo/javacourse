package com.castlesolutions.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.castlesolutions.modelos.Cliente;
import com.castlesolutions.modelos.ContaPoupanca;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// Serializando um objeto
		Cliente cliente = new Cliente(1, "John Wick", "123.456.789-00", "Desenvolvedor", "Rua 1", "1234-5678");
		ContaPoupanca conta = new ContaPoupanca(1, 1000, 500, cliente);
		
		// Serializando o objeto cliente
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		// Serializando o objeto conta
		oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));
		oos.writeObject(conta);
		oos.close();
		

//		String nome = "Nico Steppat";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();

		
	}
}