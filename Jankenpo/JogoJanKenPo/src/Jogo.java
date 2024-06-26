
public class Jogo {

	private int jogadaHumano;
	private int jogadaCpu;
	
	
	
	public Jogo(int jogHum, int jogCpu) {
		jogadaHumano = jogHum;
		jogadaCpu = jogCpu;
	}
	/*
	 * 1 - Pedra
	 * 2 - Papel
	 * 3 - Tesoura
	 */
	
	/**
	 * Método determina o ganhador do JanKenPo 
	 * ou se houve empate. 
	 * 
	 * @return -1 se o ganhador for CPU, 0 se empatou 
	 * ou 1 se o Humano ganhou
	 * 
	 */
	public int getResultado() {
		if (jogadaCpu == jogadaHumano) {
			return 0;
		}
		else if (jogadaCpu < jogadaHumano) {
			if (jogadaHumano - jogadaCpu == 1)
				return 1;
			else
				return -1;			
		}
		else { //jogadaCpu > jogadaHumano
			if (jogadaCpu - jogadaHumano == 1)
				return -1;
			else
				return 1;
		}
	}	
	
	public String getJogadaCpu() {
		if (jogadaCpu == 1)
			return "Pedra";
		else if (jogadaCpu == 2) 
			return "Papel";
		else
			return "Tesoura";
	}
	
	public String getJogadaHumano() {
		if (jogadaHumano == 1)
			return "Pedra";
		else if (jogadaHumano == 2)
			return "Papel";
		else
			return "Tesoura";
	}
	
	
	
}
