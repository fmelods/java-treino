
public class Estatistica {
	
	private double soma = 0;
	
	public Estatistica() {}
	
	public void adiciona(double valor) {
		soma = soma + valor;
	}
	
	public double getMedia() {
		return soma / 5;
	}

}
