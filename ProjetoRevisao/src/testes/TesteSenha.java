package testes;
import java.util.Scanner;

public class TesteSenha {

	public static void main(String[] args) {
		// Autenticando senha por numeros de caracter
		
		String senha;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a senha");
		senha = sc.next();
		
		if(senha.length()<4) {
			System.out.println("Falha - Minimo 6 digitos");
		}else if (senha.equals("teste")) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha inv�lida");
			
		}

	}

}
