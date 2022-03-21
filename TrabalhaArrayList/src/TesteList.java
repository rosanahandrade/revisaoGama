import java.util.ArrayList;

public class TesteList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Contato> contatos= new ArrayList();
		
		Contato c1 = new Contato("Rafael","rafael@gmail.com");
		Contato c2 = new Contato("Maria","maria@gmail.com");
		Contato c3 = new Contato("Eduardo","eduardo@gmail.com");
		Contato c4 = new Contato("Simone","simone@gmail.com");
		
		contatos.add(c1);
		contatos.add(c2);
		contatos.add(c3);
		contatos.add(c4);
		
		for (Contato c: contatos) {
			System.out.println(c.getNome()+" "+c.getEmail());
			
		}
		System.out.println("///CHAMANDO NOME POR INDICE///");
		System.out.println(contatos.get(1).getNome());
	}

}
