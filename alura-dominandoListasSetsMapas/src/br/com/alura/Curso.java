package br.com.alura;

public class Curso {
	private String nome;
	private int horas;

	public Curso(String nome, int horas) {
		this.nome = nome;
		this.horas = horas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
