import java.utill.Scanner;

public class Entrada {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Informe o ano de nascimento: ");
		int ano = tec.nextInt();
		
		System.out.print("Informe o mês por extenso do nascimento: ");
		String mes = tec.nextLine();
		
		System.out.print("Informe o dia de nascimento: ");
		int dia = tec.nextInt();
		
		System.out.println(dia + "/" + mes + "/" + ano);
	}

}
