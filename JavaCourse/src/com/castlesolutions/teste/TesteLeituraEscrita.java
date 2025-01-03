
package com.castlesolutions.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteLeituraEscrita {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Opens the file input.txt for reading
		FileInputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Opens the file output.txt for writing
		FileOutputStream fos = new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		// Reads the content of input.txt and writes it to output.txt
		String line = br.readLine();
		while (line != null) {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}

		// Closes all resources
		br.close();
		bw.close();
		System.out.println("Escrita do arquivo concluída!");
	}
}
