import java.util.ArrayList;

public class ExecutaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList contatos = new ArrayList();  //ArrayList <String> contatos = new ArrayList();
		
		contatos.add("Ana");
		contatos.add("Bia");
		contatos.add("Carlos");
		contatos.add("Daniel");
		contatos.add("Eduardo");

		
		for (Object nome : contatos) { //SE EU DECLARASSE COMO STRING NO LUGAR DO OBJECT EU ESCREVERIA STRING
			
			System.out.println(nome);
			
		}
	}

}
