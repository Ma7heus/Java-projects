package br.com.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		criandoNovoArquivo();
	}
	
	private static void criandoNovoArquivo() {
		try {
			String nomeArquivo ="arquivoTeste07";
			File file = new File("C:\\Users\\matheus.biasi\\Desktop\\logica\\" + nomeArquivo +".txt");
			
			if (file.createNewFile()) {
				System.out.println("Arquivo criado" + file.getName());
			}
			
			file.list();
			ler(file);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void  escrever(String nomeArquivo) {
		try {
			FileWriter writer =  new FileWriter("arquivoTeste07.txt");
			writer.write("hello file da puta");
			writer.close();
			System.out.println("arquivo editado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void ler(File arquivo) {
		try {
			Scanner scanner =  new Scanner(arquivo);
			
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
