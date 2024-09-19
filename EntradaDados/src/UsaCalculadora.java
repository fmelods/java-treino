
public class UsaCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora(6.5, 9.9);
		double x = c.Somar();
		System.out.println("Soma" + x);
		
		x = c.multiplicar();
		System.out.println("Produto" + x);
		
		x = c.potencia();
		System.out.println("Potencia" + x);
		
		int i = 7, j = 4;
		System.out.println(i / j);
		
		System.out.println(7.0 / j);
	}

}
