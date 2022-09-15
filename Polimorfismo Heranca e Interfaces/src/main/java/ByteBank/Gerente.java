package ByteBank;

public class Gerente extends Funcionario {
	private int senha;
	
	public Gerente(double salario, int senha) {
		super(salario);
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario() ;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
}
