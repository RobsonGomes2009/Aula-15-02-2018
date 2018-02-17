import java.util.Locale;
import java.util.Scanner;

public class AulaEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));
		
		Funcionario funcionario = new Funcionario();
		funcionario.Entrada();
		funcionario.CalcularSalario();
		funcionario.Imprime();

		sc.close();
	}

}
