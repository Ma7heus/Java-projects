package ByteBank;

public class Funcionario {
	private double salario;
	
	
	public Funcionario(double salario) {
		this.salario = salario;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
