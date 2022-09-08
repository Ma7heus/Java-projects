
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		// Para variavel do tipo Float, usaremos double, ex:
		
		double salario = 1250.70;
		System.out.println("Meu salario e de " + salario);
		
		double DivideDoisNumeros = 5/2;
		// esse tipo de divisao nao vai dar o resultado correto,
		//uma das alternativas e informar um dos valores como float
		double DivideDoisNumerosNovo = 5.0/2;
		
		System.out.println(DivideDoisNumeros);
		System.out.println(DivideDoisNumerosNovo);
		
	}
}
