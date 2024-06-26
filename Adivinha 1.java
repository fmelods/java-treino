import java.util.Random;

public class Adivinha {

	private int sorteado;
	private int quantidade;
	
	public Adivinha() {
		quantidade = 0;

		Random r = new Random();
		sorteado = r.nextInt(1000) + 1;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	/**
	 * indica a qualidade do seu chute e 
	 * acrescenta 1 na quantidade
	 * @param c - número chutado
	 * @return -1 se sorteado < chute, 
	 * 			0 se sorteado == chute
	 * 			1 se sorteado > chute
	 */
	public int chute(int c) {
		if (sorteado < c)
			return -1;
		if (sorteado == c)
			return 0;
		return 1;
		
		/*
		   if (sorteado < c)
			 return -1;
		   else if (sorteado == c)
			 return 0;
		   else	
			 return 1;
		 */
	}
}







