import java.utill.Scanner;

public class PassaCompra {

	public static void main(String[] args) {
		
		java.util.Scanner tec = new Scanner(System.in);
		
		System.out.print("CPF: ");
		String cpf = tec.nextLine();
		
		ContaSupermercado conta = new ContaSupermercado(cpf);
		
		//1 produto
		System.out.print("Produto: ");
		String prod = tec.nextLine();
		System.out.print("Quantidade");
		double qtd = tec.nextDouble();
		System.out.print("Valor unitário: ");
		double valor = tec.nextDouble();
		conta.adicionaCompra(qtd, valor, prod);
		
		//2 produto
		System.out.print("Produto: ");
		prod = tec.nextLine();
		System.out.print("Quantidade");
		qtd = tec.nextDouble();
		System.out.print("Valor unitário: ");
		valor = tec.nextDouble();
		conta.adicionaCompra(qtd, valor, prod);
		
		System.out.println("Itens: " + conta.getItens());
		System.out.println("Total: " + conta.getTotal());
	}
}
