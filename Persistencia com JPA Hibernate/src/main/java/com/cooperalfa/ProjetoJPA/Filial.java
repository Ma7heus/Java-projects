package com.cooperalfa.ProjetoJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Filial {
	
	@Id
	@SequenceGenerator(name="sequence_filial", sequenceName = "sequence_idfilial", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_filial")
	private long idFilial;
	private String descricao;
	private String numeroFilial;
	private String cidade;
	
	
	public Filial() {
	}
	
	
	
	public Filial(String descricao, String numeroFilial, String cidade) {
		this.cidade = cidade;
		this.descricao = descricao;
		this.numeroFilial = numeroFilial;
		
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNumeroFilial() {
		return numeroFilial;
	}
	public void setNumeroFilial(String numeroFilial) {
		this.numeroFilial = numeroFilial;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
	
	

}
