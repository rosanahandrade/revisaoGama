package testes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String [] nome = {"Marcos","Sergio","Carla","Regina"};
		
		FileWriter arquivo = new FileWriter("C:\\Users\\rosan\\OneDrive\\�rea de Trabalho\\funcionarios.txt"); //CRIAR O ARQUIVO
		PrintWriter gravarArquivo = new PrintWriter(arquivo); //GRAVAR INFORMA��ES

		gravarArquivo.printf("Registro dos funcion�rios");
		
		for(int i=0;i<4;i++) {
			gravarArquivo.print(nome[i]);
		}
		
		arquivo.close();
		System.out.println("O arquivo esta sendo gravado c:\\funcionarios.txt ");
	}

}
