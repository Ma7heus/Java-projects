package br.com.alura.tipodedados;

public class ManipulandoStings {

	public static void main(String[] args) {
		
		char[] teste = new char[] {'m', 'a', 't', 'h'};
		
		String string = "   paralelepipedo   ";
		System.out.println(string);
		
		System.out.println(string.length()); //numero de caracteres da string, conta os espaços tambem
		System.out.println(string.trim()); // apaga os espaços no começo e no fim
		System.out.println(string.toUpperCase()); // deixa maiusculo
		System.out.println(string.substring(1, 10)); // pega um pedaço da string
		
		// metodos de busca
		
		String palavra = "Essa e uma frase comprida pra mim usar como teste";
		
		System.out.println(palavra.indexOf("frase")); // busca a palavra e mostra a posição q ela inicia, primeira letra na proxima
		System.out.println(palavra.indexOf("m")); // buscando por letra mostra io primeiro lugar onde ela esta
		System.out.println(palavra.lastIndexOf("a")); // busca a posição de tras para frente
	}
	
}
