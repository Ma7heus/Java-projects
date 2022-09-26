package execoes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "filiais")
public class Filial extends EntityAbstract{
	@Id
	@SequenceGenerator(name = "Filial_Generator",sequenceName = "idFilial", allocationSize = 1)
	@GeneratedValue(generator = "Filial_Generator",strategy = GenerationType.SEQUENCE)
	private Long IdFilial;
	
	@Column(length = 100)
	private String nome;
	private String numero;
	
	@Column(length = 100)
	private String cidade;
		
	public Filial(String numero,String cidade,String nome) {
		this.cidade = cidade;
		this.nome = nome;
		this.numero = numero;
		
	}
	
	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}












	public String getNumero() {
		return numero;
	}












	public void setNumero(String numero) {
		this.numero = numero;
	}












	public String getCidade() {
		return cidade;
	}












	public void setCidade(String cidade) {
		this.cidade = cidade;
	}












	@Override
	public Long getId() {
		return IdFilial;
	}
	
	

}
