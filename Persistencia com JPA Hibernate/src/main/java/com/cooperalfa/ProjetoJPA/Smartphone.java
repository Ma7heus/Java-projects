package com.cooperalfa.ProjetoJPA;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.ForeignKey;

@Entity
public class Smartphone {
	
	@Id
	@SequenceGenerator(name="sequence_smartphone", sequenceName = "sequence_idsmartphone", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_smartphone")
	private long id;
	
	@OneToOne
	@JoinColumn(name = "idusuario", foreignKey = @ForeignKey(name = "fk_usuario"))
	private Usuario usuario;
	private String modelo;
	private long chapa;
	private BigDecimal valorSmart;
	private long status; // 1;EM CAMPO - 2;CONSERTO - 3;EMPRESTADO - 4;EM ESTOQUE - 5;BAIXADO
	
	public Smartphone() {
	}
	
	public Smartphone(String modelo,long chapa,BigDecimal valorSmart,long status,Usuario usuario) {
		this.chapa = chapa;
		this.modelo = modelo;
		this.status = status;
		this.valorSmart = valorSmart;
		this.usuario = usuario;
	
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long getChapa() {
		return chapa;
	}
	public void setChapa(long chapa) {
		this.chapa = chapa;
	}
	public BigDecimal getValorSmart() {
		return valorSmart;
	}
	public void setValorSmart(BigDecimal valorSmart) {
		this.valorSmart = valorSmart;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
