import java.util.Locale;
import java.util.Scanner;

public class AulaEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en","US"));
		
		
		

		Paciente paciente = new Paciente();
		paciente.Entrada();
		paciente.CalcularIMC();
		paciente.Imprime();

		sc.close();
	}

}
