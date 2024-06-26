package br.com.fiap.baralho.model;

public class Carta {
	
	private int valor;
	private String naipe;

	public Carta(int valor, String naipe) {
		super();
		this.valor = valor;
		this.naipe = naipe;
	}

	public int getValor() {
		return valor;
	}

	public String getNaipe() {
		return naipe;
	}
}
