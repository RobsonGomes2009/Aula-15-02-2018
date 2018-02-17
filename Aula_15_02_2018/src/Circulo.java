import java.util.Scanner;

public class Circulo {
	Scanner sc = new Scanner(System.in);
	double raio,area,pi=3.1415,perimetro;
	
	
	double CalcularArea() {
		return area = pi*raio*raio;
	}

	public void Imprime() {
		System.out.printf("O valor da Area do Circulo é : %.2f",CalcularArea());
		System.out.printf("\nO valor do Perimetro do Circulo é : %.2f\n",CalcularPerimetro());
		System.out.println();
	}

	public void Entrada() {
		System.out.println("Digite o valor do raio :");
		raio = sc.nextDouble();
	}

	double CalcularPerimetro() {
		return perimetro = 2*pi*raio;
	}

	

	
}