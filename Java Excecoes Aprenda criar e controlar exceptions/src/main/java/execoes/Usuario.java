package execoes;

public class Usuario extends EntityAbstract {
	private Long Id;
	private String nome;
	private String matricula;
	private Filial filial;
	
	///wjsdhfhwf


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
		return Id;
	}

}
