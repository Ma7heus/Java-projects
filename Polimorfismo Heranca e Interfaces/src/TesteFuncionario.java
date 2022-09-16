
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		EditorVideo editor1 = new EditorVideo(3025);
	
		Designer designer1 = new Designer(3500);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(designer1);
		controle.registra(editor1);
		
		System.out.println(designer1.getBonificacao());
		System.out.println(editor1.getBonificacao());
		
		System.out.println(controle.getSoma());
		
		
		
		
	}
	
}
