import java.util.Scanner;

public class Funcionario2 {
	Scanner sc = new Scanner(System.in);
	
	String nome;
	double horastrabalhadas;
	double valordahora;
	double salario;
	
	void Entrada() {
	System.out.println("Digite o nome do funcionario");	
		nome = sc.next();
	System.out.println("Digite as horas trabalhadas do funcionario");
		horastrabalhadas = sc.nextDouble();
	System.out.println("Digite o valor da hora trabalhada");
		valordahora = sc.nextDouble();
	}

	double CalcularSalario() {
		return salario = horastrabalhadas*valordahora;
		
	}

	void Imprime() {
		System.out.print("O valor referente ao salario do funcionario "+nome);
		System.out.printf(" é %.2f reais\n",CalcularSalario());
		
	}
}
