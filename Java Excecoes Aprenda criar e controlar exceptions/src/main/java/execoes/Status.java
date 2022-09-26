package execoes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Status extends EntityAbstract {
	
	@Id
	@SequenceGenerator(name = "statusGenerator",sequenceName = "idStatus",allocationSize = 1)
	@GeneratedValue(generator = "statusGenerator",strategy = GenerationType.SEQUENCE)
	private Long IdStatus;
	@Column(length = 100)
	private String descricacao;
		
	
	@Override
	public Long getId() {
		return IdStatus;
	}



	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

}
