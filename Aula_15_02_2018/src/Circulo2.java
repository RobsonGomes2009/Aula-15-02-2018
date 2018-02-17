import java.util.Scanner;

public class Circulo2 {
	Scanner sc = new Scanner(System.in);
	double raio1,raio2,raio3,area,pi=3.1415,perimetro;
	
	
	double CalcularArea1() {
		return area = pi*raio1*raio1;
	}
	double CalcularArea2() {
		return area = pi*raio2*raio2;
	}
	double CalcularArea3() {
		return area = pi*raio3*raio3;
	}

	public void Imprime1() {
		System.out.print("O valor da Area do Circulo de raio "+raio1);
		System.out.printf( " é : %.2f",CalcularArea1());
		System.out.printf("\nO valor do Perimetro do Circulo é : %.2f\n",CalcularPerimetro1());
		System.out.println();
	}
		public void Imprime2() {
		System.out.print("O valor da Area do Circulo de raio "+raio2);					
		System.out.printf( " é : %.2f",CalcularArea2());
		System.out.printf("\nO valor do Perimetro do Circulo é : %.2f\n",CalcularPerimetro2());
		System.out.println();		
	}
		public void Imprime3() {
		System.out.print("O valor da Area do Circulo de raio "+raio3);
		System.out.printf( " é : %.2f",CalcularArea3());
		System.out.printf("\nO valor do Perimetro do Circulo é : %.2f\n",CalcularPerimetro3());
		System.out.println();	}

	
	double CalcularPerimetro1() {
		return perimetro = 2*pi*raio1;
	}
	double CalcularPerimetro2() {
		return perimetro = 2*pi*raio2;
	}
	double CalcularPerimetro3() {
		return perimetro = 2*pi*raio3;
	}
	public void Entrada1() {
		System.out.println("Digite o valor do raio :");
		raio1 = sc.nextDouble();
	}
	public void Entrada2() {
		System.out.println("Digite o valor do raio :");
		raio2 = sc.nextDouble();
	}
	public void Entrada3() {
		System.out.println("Digite o valor do raio :");
		raio3 = sc.nextDouble();
	}	
}