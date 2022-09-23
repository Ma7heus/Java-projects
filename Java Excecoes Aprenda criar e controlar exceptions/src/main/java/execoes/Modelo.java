package execoes;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "modelo")
public class Modelo extends EntityAbstract {
	@Id
	@SequenceGenerator(name = "Modelo_Generator", sequenceName = "idModelo", allocationSize = 1)
	@GeneratedValue(generator = "Modelo_Generator",strategy = GenerationType.SEQUENCE)
	private Long idModelo;
	@Column(length = 100)
	private String descricao;
	@Column(precision = 10,scale = 5)
	private BigDecimal quantidadeEstoque;
	
	@Override
	public Long getId() {
		return idModelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(BigDecimal quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	
	
}
