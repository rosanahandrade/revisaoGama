import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;


public class CriarArquivoCasa {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			String [] nome = {"Marcos","Sergio","Carla","Regina"};
			int [] idade = {20,45,33,19};
			String [] email = {"marcos@gmail.com","sergio@gmail.com","carla@gmail.com","regina@gmail.com"};
			
			FileWriter arquivo = new FileWriter("C:\\Users\\rosan\\OneDrive\\Área de Trabalho\\funcionarios2.txt"); //CRIAR O ARQUIVO
			PrintWriter gravarArquivo = new PrintWriter(arquivo); //GRAVAR INFORMAÇÕES

			gravarArquivo.printf("Registro dos funcionários"+"\n");
			
			for(int i=0;i<4;i++) {
				gravarArquivo.print(nome[i]+" "+idade[i]+" "+email[i]+"\n");
				
			}
			
			arquivo.close();
			System.out.println("O arquivo esta sendo gravado C:\\Users\\rosan\\OneDrive\\Área de Trabalho\\funcionarios1.txt");
		}

	}
