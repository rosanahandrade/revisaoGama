package testes;
import java.util.Scanner;

public class TesteRevisao {

	public static void main(String[] args) {


		String produto;
		float vl_produto,total;
		int qtdade_produto;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Nome do Produto: ");
		produto = sc.next();
		
		System.out.println(" Valor : ");
		vl_produto = sc.nextFloat();
		
		System.out.println(" Quantidade : ");
		qtdade_produto = sc.nextInt();
		
		total = qtdade_produto * vl_produto;
		
		System.out.println("Produto:"+produto+" Valor de Estoque: "+total);

	}

}
