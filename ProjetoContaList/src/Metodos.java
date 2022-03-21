import java.util.ArrayList;
import java.util.Scanner;

public class Metodos extends Conta {
	
	ArrayList<Conta> refconta;
	
	public void cadastrar(Conta c) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a AGÊNCIA: ");
		super.agencia = sc.nextInt();
		
		System.out.println("Digite a CONTA: ");
		super.conta = sc.nextInt();	
		
		System.out.println("Digite o SALDO: ");
		super.saldo = sc.nextDouble();	
		
		System.out.println("Digite a NOME: ");
		super.nome = sc.next();	
		
		System.out.println("Digite a TELEFONE: ");
		super.telefone = sc.next();	
		
		System.out.println("Digite a EMAIL: ");
		super.email = sc.next();
		
		refconta.add(c);
	}

}
