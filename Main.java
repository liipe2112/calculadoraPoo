package calculadora;

import java.util.Scanner;

public class Main {
	
	public double divisao(double numero1, double numero2) {
		return this.divisao(numero2, numero2);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" ************************************");
		System.out.println(" * Bem-vindo a calculadora Java POO *");
		System.out.println(" ************************************");
		
		System.out.println("Digite o numero 1: ");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Digite o numero 2: ");
		double numero2 = entrada.nextDouble();
		
		Calculadora c = new Calculadora(); 
		
		System.out.println("Sua soma é : " + c.soma(numero1, numero2));
		System.out.println("Sua subtração é: " + c.subtracao(numero1, numero2));
		System.out.println("Sua multiplicação é: " + c.multiplicacao(numero1, numero2));
		System.out.println("Sua divisão é: " + c.divisao(numero1, numero2));
		
	}
}
