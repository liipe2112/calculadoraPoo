package calculadora;

public class Calculadora {
	private double numero1;
	private double numero2;
	
	public Calculadora(double num1, double num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
	public void setNumero1(double num1) {
		this.numero1 = num1;
	}
	
	public void setNumero2(double num2) {
		this.numero2 = num2;
	}
	
	public double getNumero1() {
		return this.numero1;
	}
	
	public double getNumero2() {
		return this.numero2;
	}
	
	public double soma() {
		return this.numero1 + this.numero2;
	}
	
	public double subtracao() {
		return this.numero1 - this.numero2;
	}
	
	public double multiplicacao() {
		return this.numero1 * this.numero2;
	}
	
	public double divisao() {
		return this.numero1 / this.numero2;
	}
}
