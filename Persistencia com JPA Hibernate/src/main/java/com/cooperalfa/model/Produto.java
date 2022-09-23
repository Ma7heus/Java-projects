package com.cooperalfa.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
	@SequenceGenerator(name = "sequence_produtos", sequenceName = "sequence_idproduto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_produtos")
	private Long id;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();	
	
	@ManyToOne
	private Categoria categoria;
	
	public Produto(String descricao,BigDecimal preco,Categoria categoria) {
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public Produto() {
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	public Long getId(Long id) {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
	

}
