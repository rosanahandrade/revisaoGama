package testes;


import java.util.Scanner;

public class LacoEeMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] nomefuncionario=new String [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			System.out.println("Entre com o :"+(i+1)+"º funcionário");
			nomefuncionario[i]=sc.next();
		}
		
		for(int i=0;i<nomefuncionario.length;i++) {
			System.out.println("Funcionário: "+nomefuncionario[i]);
			
		}

	}

}
