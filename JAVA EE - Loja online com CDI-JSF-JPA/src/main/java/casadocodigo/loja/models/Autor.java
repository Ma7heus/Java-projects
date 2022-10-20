package casadocodigo.loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autor_casadocodigo")
public class Autor {
	
	@Id
	@SequenceGenerator(name = "GENERATOR_AUTOR", sequenceName = "sequnce_autor",allocationSize = 1)
	@GeneratedValue(generator = "GENERATOR_AUTOR",strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nome;	
	
	public Autor(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Autor() {
	}
	
	public Autor(Long autorId) {
		this.id = autorId;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
