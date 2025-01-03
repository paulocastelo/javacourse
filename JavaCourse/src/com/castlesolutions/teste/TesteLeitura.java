
package com.castlesolutions.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		// Opens the file input.txt for reading
		FileInputStream fis = new FileInputStream("input.txt");

		// Converts the byte stream into a character stream
		InputStreamReader isr = new InputStreamReader(fis);

		// Reads the character stream efficiently, line by line
		BufferedReader br = new BufferedReader(isr);

		// Reads the first line of the file
		String line = br.readLine();

		// Continues reading the file until the end
		while (line != null) {
			// Prints the read line to the console
			System.out.println(line);

			// Reads the next line of the file
			line = br.readLine();
		}

		// Closes the BufferedReader
		br.close();
		
		// Closes the InputStreamReader
		isr.close();
		
		// Closes the FileInputStream
		fis.close();
		
		// Prints a message to the console
		System.out.println("Leitura do arquivo concluída!");
		
	}
}
