import java.util.Locale;
import java.util.Scanner;

public class ex1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));
		
		Funcionario2 funcionario = new Funcionario2();
		
		for(int i=0;i<3;i++) {
			funcionario.Entrada();
			funcionario.CalcularSalario();
			funcionario.Imprime();
			System.out.println();
		}
		
		
		sc.close();
	}

}
