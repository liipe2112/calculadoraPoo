package calculadora;

public class Calculadora {
	
	public double soma(double numero1, double numero2) {
		Soma soma = new Soma(numero1, numero2);
		return soma.somar();
	}
	
	public double subtracao(double numero1, double numero2) {
		Subtracao subtracao = new Subtracao(numero1, numero2);
		return subtracao.subtrair();
	}
	
	public double multiplicacao(double numero1, double numero2) {
		Multiplicacao multiplicacao = new Multiplicacao(numero1, numero2);
		return multiplicacao.multiplicar();
	}
	
	public double divisao (double numero1, double numero2) {
		Divisao divisao = new Divisao(numero1, numero2);
		return divisao.dividir();
	}
}
