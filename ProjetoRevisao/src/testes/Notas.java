package testes;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aluno;
		double nota1,nota2,media;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Nome do Aluno ");
		aluno = sc.next();
		
		System.out.println(" Nota 1 ");
		nota1 = sc.nextDouble();
		
		System.out.println(" Nota 2 : ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media>6) {
			System.out.println("Aluno Aprovado");	
		}else if (media >4) {
			System.out.println("Aluno de Recuperação");
		}else {
			System.out.println("Aluno Reprovado");
		}

	}

}
