
public abstract class Funcionario {
	private double salario;
	
	public Funcionario(double salario) {
		this.salario = salario;
	}
		
	public abstract double getBonificacao();

	public double getSalario() {
		return this.salario;
	}
}
