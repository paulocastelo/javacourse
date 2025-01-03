package com.castlesolutions.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		// Opens the file output.txt for writing
		FileOutputStream fos = new FileOutputStream("output.txt");

		// Converts the byte stream into a character stream
		OutputStreamWriter osw = new OutputStreamWriter(fos);

		// Writes the character stream efficiently, line by line
		BufferedWriter bw = new BufferedWriter(osw);

		// Writes the first line of the file
		try {
			bw.write("Hello, World!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Writes the second line of the file
		bw.write("Hello, Java!");

		// Closes the BufferedWriter
		bw.close();

		// Closes the OutputStreamWriter
		osw.close();

		// Closes the FileOutputStream
		fos.close();

		// Prints a message to the console
		System.out.println("Escrita do arquivo concluída!");
		
	}

}
