import java.util.Scanner;

public class Palavra {
	Scanner sc = new Scanner(System.in);
	String entrada = sc.next();
	
	String MudarPalavra() {
		return entrada.toUpperCase();
	}
	void imprimir() {
		System.out.println(MudarPalavra());
	}
}
