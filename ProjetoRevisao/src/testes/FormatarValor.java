package testes;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatarValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dval = 2.8987;
		
		String format = "0.00";
		NumberFormat formatar = new DecimalFormat(format);
		String newDval =formatar.format(dval);
		
		System.out.println(newDval);

	}

}
