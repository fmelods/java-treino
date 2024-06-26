package br.com.fiap.modelo;

public class Partida {
	
	private Time casa;
	
	private Time visitante;
	
	private String local;
	
	private int golsCasa;
	
	private int golsVisitante;

	public Partida(Time casa, Time visitante, String local) {
		super();
		this.casa = casa;
		this.visitante = visitante;
		this.local = local;
	}

	public Partida(Time casa, Time visitante, String local, int golsCasa, 
					int golsVisitante) {
		
		this(casa, visitante, local);
		
		this.golsCasa = golsCasa;
		this.golsVisitante = golsVisitante;
		
		casa.addPartidasJogadas();
		visitante.addPartidasJogadas();
		
		if (golsCasa > golsVisitante) {
			casa.addVitoria();			
		}
		else if (golsCasa < golsVisitante) {
			visitante.addVitoria();
		}
		else {
			visitante.addEmpate();
			casa.addEmpate();
		}
		
	}
	
	
	
	

}
