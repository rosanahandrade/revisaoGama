import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteConta {

	public static void main(String[] args) throws IOException {
		// usando o ArrayList, Cadastrar , listar contas
		
		int opcao;
		int agencia;
		int conta;
		ArrayList <Conta> contas = new ArrayList();
		
		
		while(true) {


		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===DIGITE A OP??O DESEJADA===");
		System.out.println("1 - Cadastrar ");
		System.out.println("2 - Consultar");
		System.out.println("3 - Gravar Arquivo");
		System.out.println("4 - Ler Arquivo");
		System.out.println("5 - Sair");
		
		opcao=sc.nextInt();
		
		
		
		Conta c = new Conta();
		switch (opcao) {
		case 1: 
			
			
			System.out.println("Digite a AG?NCIA: ");
			c.agencia = sc.nextInt();
			
			System.out.println("Digite a CONTA: ");
			c.conta = sc.nextInt();	
			
			System.out.println("Digite o SALDO: ");
			c.saldo = sc.nextDouble();	
			
			System.out.println("Digite a NOME: ");
			c.nome = sc.next();	
			
			System.out.println("Digite a TELEFONE: ");
			c.telefone = sc.next();	
			
			System.out.println("Digite a EMAIL: ");
			c.email = sc.next();
			
				contas.add(c);
			

			break;
			
		case 2:

			for (Conta cont : contas) {
				
				System.out.println("Ag?ncia: "+cont.getAgencia()+" "+"Conta: "+ cont.getConta()+" "+"Saldo: "+ cont.getSaldo()+" "+"Nome: "+ cont.getNome()+" "+"Telefone: "+ cont.getTelefone()+" "+"Email: "+ cont.getEmail());
				
				
			}
			
			break;
			
		case 3:
			
			FileWriter arquivo = new FileWriter("C:\\Users\\rosan\\OneDrive\\?rea de Trabalho\\funcionarios3.txt"); //CRIAR O ARQUIVO
			PrintWriter gravarArquivo = new PrintWriter(arquivo); //GRAVAR INFORMA??ES

			gravarArquivo.printf("Registro dos funcion?rios"+"\n");
			
			for (Conta cont : contas) {
				gravarArquivo.print("Ag?ncia: "+cont.getAgencia()+" "+"Conta: "+ cont.getConta()+"\n");
				
			}
			
			arquivo.close();
			System.out.println("O arquivo esta sendo gravado C:\\Users\\rosan\\OneDrive\\?rea de Trabalho\\funcionarios3.txt");
			break;
			
		case 4:
			String mostra = "";
			
			String nomeArq = "C:\\Users\\rosan\\OneDrive\\?rea de Trabalho\\funcionarios3.txt";
			
			String linha = "";
			
			File arq = new File(nomeArq);
			
			
			//Uma an?lise para verificar se o arquivo existe
			if(arq.exists()) {
				
				mostra="Arquivo - "+arq+" -  aberto com sucesso.";
				System.out.println(mostra);
				
				mostra= "Tamanho de Arquivo - "+Long.toString(arq.length())+"\n";
				System.out.println(mostra);
				
				//Processo de tentativa de leitura
				try{
				FileReader reader = new FileReader(arq);
				
				BufferedReader leitor = new BufferedReader(reader);
				while(true) {
					linha=leitor.readLine();
					System.out.println(linha);
					if(linha==null) 
						break;
						mostra+=linha+"\n";
					}
				
			}catch(Exception erro) {}
				JOptionPane.showMessageDialog(null, mostra,"Arquivo...",1);

		}else {
			System.out.println("Arquivo Existente");
		}
			
			break;
			
		case 5:
			break;
			
		default:
			System.out.println("Digite op??o v?lida");
			
		}
		
		if(opcao==5) {
			System.out.println(" SAIU ");
			break;
		}

		
		}	
		
		

		
		

	}

}
