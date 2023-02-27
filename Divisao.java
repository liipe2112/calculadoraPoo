package calculadora;

public class Divisao {
	private double numero1;
	private double numero2;
	
	public Divisao(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public double getNumero1() {
		return numero1;
	}
	
	public double getNumero2() {
		return numero2;
	}
	
	public double dividir() {
		if (numero2 == 0 || numero1 == 0) {
			System.out.println("Não é possível dividir por 0");
		}
		return numero1 / numero2;
	}
}
