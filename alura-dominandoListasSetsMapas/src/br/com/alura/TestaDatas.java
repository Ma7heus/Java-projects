package br.com.alura;

import java.util.Calendar;
import java.util.Date;

public class TestaDatas {
	
	public static void main(String[] args) {
		
		
		
		Date dataIni = new Date();
		
		for (int i = 0; i < 100000 ; i++) {
			System.out.println(i);
		}
		Date dataFim= new Date();
		System.out.println("Começou " + dataIni.getHours() + ":" + dataIni.getMinutes() +":"+ dataIni.getSeconds() + ":" + Calendar.MILLISECOND);
		System.out.println("terminou " + dataFim.getHours() + ":" + dataFim.getMinutes() +":"+ dataFim.getSeconds() + ":" + Calendar.MILLISECOND);
	}

}
