package br.com.alura.tipodedados;

public class Main {

	public static void main(String[] args) {

		soma(4,5,3);
		
	}

	private static void soma(int... numeros) {
		int resultado = 0;
		for(int i = 0; i < numeros.length; i++ ) {
			resultado += numeros[i];
		}
		System.out.println(resultado);
	}
	
	

}
