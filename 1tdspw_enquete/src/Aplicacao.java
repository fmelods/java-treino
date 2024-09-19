import java.util.Scanner;

public class Aplicacao {
	
	
	//para ser uma classe executável, devemos implementar o método main
	
	public static void main(String[] args) {
		//para colher informações do usuario, usamos a classe Scanner
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("1. Qual o seu nome?");
		String nome = tec.nextLine();
		
		System.out.println("2. Defina classe e objeto?");
		String defClasse = tec.nextLine();
		
		System.out.println("3. Qual a função do construtor?");
		String construtor = tec.nextLine();
		
		System.out.println("4. Qual a sua maior dificuldade?");
		String dificuldade = tec.nextLine();
		
		//qual o objetivo do meu programa?
		//a) imprimir na tela as respostas
		//b) armazenar as respostas em um arquivo (txt, excel, word, pdf)
		//c) guardar as informações no banco de dados
		//d) enviar por email ou mandar para uma API
		
		System.out.println("Seguem as respostas:");
		System.out.println(nome + ";" + defClasse + ";" + construtor + ";" + 
							dificuldade);
		
		System.out.printf("%s - %s - %s - %s", nome, defClasse, construtor, 
							dificuldade);	
	}

}
