package execoes;

public class Filial extends EntityAbstract{
	private Long Id;
	private String nome;
	private String numero;
	private String cidade;
	
	
	
	
	
	
	
	
	
	
	
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
		return Id;
	}
	
	

}
