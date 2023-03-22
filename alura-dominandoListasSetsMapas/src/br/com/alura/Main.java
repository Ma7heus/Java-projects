package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Curso c1 =  new Curso("Java 8", 120);
		
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(c1);
		cursos.forEach(curso -> {
			System.out.println(curso.getNome());
		});
		
	
		
		
		
	}

}
