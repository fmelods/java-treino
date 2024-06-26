import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Adivinha jogo = new Adivinha();
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Chute: ");
		int c = tec.nextInt();
		int resposta = jogo.chute(c);
		if (resposta == 0) {
			System.out.println("Parabéns, você acertou!");
		}
		else if (resposta < 0)
			System.out.println("Tente um número menor!");
		else
			System.out.println("Tente um número maior!");

		
		System.out.print("Chute: ");
		c = tec.nextInt();
		resposta = jogo.chute(c);
		if (resposta == 0) {
			System.out.println("Parabéns, você acertou!");
		}
		else if (resposta < 0)
			System.out.println("Tente um número menor!");
		else
			System.out.println("Tente um número maior!");

		System.out.print("Chute: ");
		c = tec.nextInt();
		resposta = jogo.chute(c);
		if (resposta == 0) {
			System.out.println("Parabéns, você acertou!");
		}
		else if (resposta < 0)
			System.out.println("Tente um número menor!");
		else
			System.out.println("Tente um número maior!");

		
	}
	
}
