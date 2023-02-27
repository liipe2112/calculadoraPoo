package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" ************************************");
		System.out.println(" * Bem-vindo a calculadora Java POO *");
		System.out.println(" ************************************");
		
		System.out.println("Digite o numero 1: ");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Digite o numero 2: ");
		double numero2 = entrada.nextDouble();
		
		Soma soma = new Soma (numero1, numero2);
		Subtracao subtracao = new Subtracao (numero1, numero2);
		Multiplicacao multiplicacao = new Multiplicacao (numero1, numero2);
		Divisao divisao = new Divisao (numero1, numero2);
		
		System.out.println("Soma: " + soma.somar());
		System.out.println("Subtração: " + subtracao.subtrair());
		System.out.println("Multiplicação: " + multiplicacao.multiplicar());
		System.out.println("Divisao: " + divisao.dividir());
		
		
		
	}
}
