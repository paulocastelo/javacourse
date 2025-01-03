
package com.castlesolutions.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteEscritaPrintStreamPrintWriter {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Digite o texto que deseja escrever no arquivo (pressione Ctrl + T para terminar):");
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Digite o nome do arquivo que deseja criar:");
		String nomeArquivo = br.readLine();
		FileOutputStream fos = new FileOutputStream(nomeArquivo);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		StringBuilder inputBuilder = new StringBuilder();
		int ch;
		while ((ch = br.read()) != -1) {
			if (ch == 20) { // ASCII code for Ctrl + T
				break;
			}
			inputBuilder.append((char) ch);
		}

		bw.write(inputBuilder.toString());
		bw.newLine();

		br.close();
		bw.close();
		System.out.println("Escrita do arquivo concluída!");
	}
}
