package testes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o n?mero para calcular a tabuada");
		num = sc.nextInt();
		
		
		for(int i=0;i<11;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}

	}

}
