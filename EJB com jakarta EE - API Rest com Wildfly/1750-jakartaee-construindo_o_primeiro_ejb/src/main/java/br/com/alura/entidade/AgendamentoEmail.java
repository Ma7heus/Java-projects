package br.com.alura.entidade;

import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class AgendamentoEmail {

	@Id
	@SequenceGenerator(name = "Generate_AgendamentoEmail", sequenceName = "sequence_id",allocationSize = 1)
	@GeneratedValue(generator = "Generate_AgendamentoEmail", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String email;
	private String assunto;
	private String mensagem;
	private Boolean Agendado;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Boolean getAgendado() {
		return Agendado;
	}
	public void setAgendado(Boolean agendado) {
		Agendado = agendado;
	}
	
	
}
