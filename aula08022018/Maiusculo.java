import java.util.Scanner;

public class Maiusculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra qualquer");
		
		Palavra palavra = new Palavra();
		palavra.imprimir();
		
		sc.close();

	}

	
	

}
