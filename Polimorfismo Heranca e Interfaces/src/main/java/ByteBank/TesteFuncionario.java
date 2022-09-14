package ByteBank;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Matheus");
		f1.setNome("112122121212");
		f1.setSalario(1500);
		
		System.out.println(f1.getBonificacao());
		
	}
}
