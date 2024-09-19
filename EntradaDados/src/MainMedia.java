
public class MainMedia {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double soma = 0;
		Estatistica est = new Estatistica();
		
		System.out.print("Digite 1 num: ");
		double num = tec.nextDouble();
		soma = soma + num;
		est.adiciona(num);
		
		System.out.print("Digite 2 num: ");
		double num = tec.nextDouble();
		soma = soma + num;
		est.adiciona(num);

		System.out.print("Digite 3 num: ");
		double num = tec.nextDouble();
		soma = soma + num;
		est.adiciona(num);
		
		System.out.print("Digite 4 num: ");
		double num = tec.nextDouble();
		soma = soma + num;
		est.adiciona(num);
		
		System.out.print("Digite 5 num: ");
		double num = tec.nextDouble();
		soma = soma + num;
		est.adiciona(num);
		
		double media = soma / 5;
		
		System.out.println("Media vale " + media);
	}

}
