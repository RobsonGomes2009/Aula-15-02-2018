import java.util.Locale;
import java.util.Scanner;

public class ex1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		
		
		
		Circulo1 circulo = new Circulo1();
		
		
		circulo.CalcularArea1();
		circulo.CalcularPerimetro1();
		circulo.Imprime1();
		circulo.CalcularArea2();
		circulo.CalcularPerimetro2();
		circulo.Imprime2();
		circulo.CalcularArea3();
		circulo.CalcularPerimetro3();
		circulo.Imprime3();
		
		
		sc.close();
	}

}
