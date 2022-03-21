import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class LerArquivoCasa {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String mostra = "";
		
		String nomeArq = "C:\\Users\\rosan\\OneDrive\\Área de Trabalho\\funcionarios2.txt";
		
		String linha = "";
		
		File arq = new File(nomeArq);
		
		
		//Uma análise para verificar se o arquivo existe
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
		
}


}