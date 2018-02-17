import java.util.Locale;
import java.util.Scanner;

public class AulaEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		
		
		
		Circulo circulo = new Circulo();
		
		circulo.Entrada();
		circulo.CalcularArea();
		circulo.CalcularPerimetro();
		circulo.Imprime();
		
		
		sc.close();
	}

}
