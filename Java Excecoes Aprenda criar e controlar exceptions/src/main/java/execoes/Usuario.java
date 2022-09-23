package execoes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario extends EntityAbstract {
	@Id
	@SequenceGenerator(name = "Usuario_Generator",sequenceName = "Id",allocationSize = 1)
	@GeneratedValue(generator = "Usuario_Generator", strategy = GenerationType.SEQUENCE)
	private Long IdUsuario;
	@Column(length = 100)
	private String nome;
	private String matricula;
	
	@ManyToOne
	private Filial filial;


	
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



	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return IdUsuario;
	}

}
