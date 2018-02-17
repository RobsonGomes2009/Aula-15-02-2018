import java.util.Scanner;

public class Paciente {
	Scanner sc = new Scanner(System.in);
	
	String nome;
	double peso;
	double altura;
	double IMC;
	
	public void Entrada() {
		System.out.println("Digite o nome do Paciente :");
		nome = sc.nextLine();
		System.out.println("Digite o peso do Paciente :");
		peso = sc.nextDouble();
		System.out.println("Digite a altura do Paciente :");
		altura = sc.nextDouble();
	}

	double CalcularIMC() {
		return IMC = peso/(altura*altura);
		
	}

	public void Imprime() {
		System.out.print("O IMC referente ao Paciente "+nome);
		System.out.printf(" é : %.2f",CalcularIMC());
		
	}
}
