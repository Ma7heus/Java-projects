package ByteBank;

public class ControleBonificacao {
	private double soma;

	public double getSoma() {
		return this.soma;
	}
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
		
	}
	
	
	
}
