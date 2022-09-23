package execoes;

public class Status extends EntityAbstract {
	private Long IdStatus;
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
