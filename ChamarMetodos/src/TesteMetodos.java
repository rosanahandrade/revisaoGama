import java.util.Scanner;

public class TesteMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		String email;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome: ");
		nome=sc.nextLine();
		
		System.out.println("Qual idade: ");
		idade=sc.nextInt();
		
		System.out.println("Qual o email: ");
		email=sc.next();
		
		ProcMetodo m1 = new ProcMetodo();
		m1.mensagem(nome, idade, email);
		m1.idade(idade);
		

	}

}
