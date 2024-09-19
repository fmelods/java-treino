package fiap;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		//criando alguns objetos carro
		Carro cor = new Carro();
		cor.modelo = "Corolla";
		cor.montadora = "Toyota";
		cor.anoFabricacao = 2018;
		cor.anoModelo = 2018;
		cor.quilometragem = 10_000;
		
		Carro gol = new Carro();
		gol.modelo = "Gol GTI";
		gol.montadora = "Volkswagen";
		gol.anoFabricacao = 2010;
		gol.anoModelo = 2011;
		gol.quilometragem = 180_000;
		
		System.out.println("Hello World");
		System.out.println(cor.modelo);
		System.out.println(gol.modelo);
		System.out.println(gol.quilometragem);
	
	}
	
}
