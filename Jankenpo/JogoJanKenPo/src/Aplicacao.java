import java.util.Random;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner tec = new Scanner(System.in);
		
		System.out.print("1 - Pedra\n2 - Papel\n3 - Tesoura:");
		int jogadaUsu = tec.nextInt();
		int jogadaComp = rand.nextInt(3) + 1;
		
		Jogo j = new Jogo(jogadaUsu, jogadaComp);
		int resultado = j.getResultado();
		
		if (resultado == 0) {
			System.out.println("Empate!");
		}
		else if (resultado == 1) {
			System.out.println("Ser humano venceu!");
		}
		else {
			System.out.println("CPU venceu!");
		}
		
		System.out.println(j.getJogadaHumano() + " X " + j.getJogadaCpu());
	}
	
}
