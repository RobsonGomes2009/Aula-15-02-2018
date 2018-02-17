import java.util.Locale;
import java.util.Scanner;

public class ex1_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));
		
		Funcionario1 funcionario = new Funcionario1();
		
	
		funcionario.CalcularSalario1();
		funcionario.Imprime1();

	
		funcionario.CalcularSalario2();
		funcionario.Imprime2();

	
		funcionario.CalcularSalario3();
		funcionario.Imprime3();

		
		sc.close();
	}

}
