package com.castlesolutions.teste;
import com.castlesolutions.modelos.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente user = new Cliente(1, "João", "123.456.789-00", "Engenheiro", "Rua dos Bobos, 0", "(11) 9999-9999");
		System.out.println(user);
	}

}
