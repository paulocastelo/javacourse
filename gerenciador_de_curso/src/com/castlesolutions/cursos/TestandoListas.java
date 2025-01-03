package com.castlesolutions.cursos;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		System.out.println(aulas.size());
		System.out.println(aulas.get(0));
		System.out.println(aulas.get(1));
		System.out.println(aulas.get(2));

		aulas.remove(0);
		aulas.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println(aulas);

		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});

	    String primeiraAula = aulas.get(0);
	    
	    System.out.println("A primeira aula é " + primeiraAula);
	    
	    //Parei em 11:30 da aula 01 de ArrayList
	    }

}
