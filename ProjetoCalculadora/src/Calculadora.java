import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Projeto Calculadora
		

		
		int opcao;
		int num1=0;
		int num2=0;
		
		while(true) {
				
		
		System.out.println("===DIGITE A OP??O DESEJADA===");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra??o");
		System.out.println("3 - Multiplica??o");
		System.out.println("4 - Divis?o");
		System.out.println("5 - Sair");
		
		Scanner sc = new Scanner(System.in);
		
		opcao = sc.nextInt();
		
		if(opcao < 5) {
		
		System.out.println("Digite o primeiro n?mero");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo n?mero");
		num2 = sc.nextInt();
		}
		
		
		switch (opcao) {
		case 1: 
			Metodos.soma(num1, num2);
		break;
		
		case 2:
			Metodos.subtracao(num1, num2);
			break;
			
		case 3:
			Metodos.multiplicacao(num1, num2);
			break;	
		case 4:
			Metodos m1 = new Metodos();
			m1.divisao(num1, num2);
			break;	
		case 5:
			System.out.println("Saiu");
			break;
			default:
				System.out.println("Informe op??o v?lida");
			
		
				
		}
		
		if(opcao==5) {
			
			break;
		}
		
		}
		
		
		
	

	}

}
