package fiap;
public class Carro {
	private String modelo;
	private String montadora;
	private int anoFabricacao;
	private int anoModelo;
	private int quilometragem;
	
	public Carro(String model, String maker, int year, int yearModel, int km)
	{
		modelo = model;
		montadora = maker;
		anoFabricacao = year;
		anoModelo = yearModel;
		quilometragem = km;
	}

}
