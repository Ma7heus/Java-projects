
public class TestaGerente {
	public static void main(String[] args) {
	
		Gerente g1 = new Gerente(2500);
		
		boolean autenticou = g1.autentica(1234);		
		System.out.println(autenticou);
		
		System.out.println("A bonificacao do Gerente e de R$ " + g1.getBonificacao());
		
		
	}
	
	
	
}
