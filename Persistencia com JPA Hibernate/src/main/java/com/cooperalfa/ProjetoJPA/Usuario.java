package com.cooperalfa.ProjetoJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.ForeignKey;

@Entity
public class Usuario {
	
	@Id
	@SequenceGenerator(name="sequence_usuario", sequenceName = "sequence_idusuario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_usuario")
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "idfilial", foreignKey = @ForeignKey(name = "fk_filial"))
	private Filial filial;	
	
	private String nome;
	private String matricula;

	
	public Usuario(){
		
	}
	public Usuario(String nome, String matricula, Filial filial) {
		this.filial = filial;
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	
	
	
	
	
	
	

}
