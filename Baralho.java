package br.com.fiap.baralho.model;

import java.util.ArrayList;
import java.util.List;

public class Baralho {

	private List<Carta> monte;
	
	public Baralho() {
		this.monte = new ArrayList<>();
		
		Carta c = new Carta(1, "PAUS");
		this.monte.add(c);
		
		c = new Carta(2, "PAUS");
		this.monte.add(c);
		
		c = new Carta(3, "PAUS");
		this.monte.add(c);
		
		
		
		
	}
	
}
