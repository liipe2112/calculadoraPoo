package calculadora;

public class CalculadoraObjeto {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(10.0, 5.0);
		System.out.println("Soma: " + calculadora.soma());
		System.out.println("Subtração: " + calculadora.subtracao());
		System.out.println("Multiplicação: " + calculadora.multiplicacao());
		System.out.println("Divisaão: " + calculadora.divisao());
	}
}
