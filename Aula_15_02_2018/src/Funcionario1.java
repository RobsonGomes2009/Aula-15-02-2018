import java.util.Scanner;

public class Funcionario1 {
	Scanner sc = new Scanner(System.in);
	String nome1="Joao",nome2="Mateus",nome3="Lucas";
	double horastrabalhadas1=20,horastrabalhadas2=40,horastrabalhadas3=40;
	double valordahora1=3.50,valordahora2=5.50,valordahora3=13.50;
	double salario1,salario2,salario3;
	
	
	double CalcularSalario1() {
		return salario1 = horastrabalhadas1*valordahora1;	
	}
	void Imprime1() {
		System.out.print("O valor referente ao salario do funcionario "+nome1);
		System.out.printf(" é %.2f reais\n",CalcularSalario1());		
	}
	
	double CalcularSalario2() {
		return salario2 = horastrabalhadas2*valordahora2;
	}
	void Imprime2() {
		System.out.print("O valor referente ao salario do funcionario "+nome2);
		System.out.printf(" é %.2f reais\n",CalcularSalario2());	
	}
	
	double CalcularSalario3() {
		return salario3 = horastrabalhadas3*valordahora3;
	}
	void Imprime3() {
		System.out.print("O valor referente ao salario do funcionario "+nome3);
		System.out.printf(" é %.2f reais\n",CalcularSalario3());	
	}
}


	
	