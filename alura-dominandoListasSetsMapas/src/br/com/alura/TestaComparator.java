package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaComparator {
	
	public static void main(String[] args) {
	
		Curso c1 = new Curso("Java 8", 20);
		Curso c2 = new Curso("Java 11", 30);
		
		List<Curso> cursos =  new ArrayList<>();
		
		cursos.add(c1);
		cursos.add(c2);
		
	}
	

}
