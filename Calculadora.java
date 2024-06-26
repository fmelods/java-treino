
public class Calculadora {

	private double a;
	private double b;
	
	//public Calculadora(double x, double y) {
	//	a = x;
	//	b = y;
	//}
	
	public Calculadora(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double potencia() {
		return Math.pow(a, b);
	}
	
	
	
}
