package br.com.arquivos;

import java.util.Date;

public class Teste {
	
	public static final int DAY_OF_MONTH = 5;

	public static void main(String[] args) {
		Date dataAtual =  new Date();
		Date novo = somaDiasNoMes(dataAtual, 30);
		

	}
	
    public static Date somaDiasNoMes(final Date atual, final int valor) {
        return soma(atual, DAY_OF_MONTH, valor);
    }

	private static Date soma(Date atual, int dayOfMonth, int valor) {
		// TODO Auto-generated method stub
		return null;
	}

}
