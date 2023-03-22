package br.com.arquivos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test_2 {

	public static void main(String[] args) {
		String n = formataValorNumero(new BigDecimal(15), 5);
		System.out.println(formataValorNumero(new BigDecimal(15), 5));
		
	}
	
	
	public static String formataValorNumero(BigDecimal numero, int tamanhoCampo) {
		BigDecimal numeroArredondado = new BigDecimal(numero.toString()).setScale(2, RoundingMode.HALF_UP);
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(numeroArredondado);
		while (sBuilder.length() < tamanhoCampo) {
			sBuilder.insert(0, "0");
		}
		return sBuilder.toString();
	}
}