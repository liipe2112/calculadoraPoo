package calculadora;

public class Divisao {
	private double numero1;
	private double numero2;
	
	public Divisao(double num1, double num2) {
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
		return numero1;
	}
	
	public double getNumero2() {
		return numero2;
	}
}
