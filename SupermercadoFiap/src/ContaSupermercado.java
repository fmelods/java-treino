
public class ContaSupermercado {
	
	private String cpf;
	private double total;
	private String itens;
	
	//instanciar o objeto e inicializar seus atributos
	public ContaSupermercado(String documento) {
		cpf = documento;
		total 0;
		itens = "";
	}
	
	public ContaSupermercado() {
		cpf = "";
		total = 0;
		itens ="";
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setcpf(String c) {
		cpf = c;
	}
	
	public double gettotal() {
		return total;
	}
	
	public void setTotal(double t) {
		total = t;
	}
	
	//recuperar o valor do atributo
	public String getItens() {
		return itens;
	}
	
	//alterar o valor do atributo
	public void setItens(String s) {
		itens = s;
	}
	
	public void adicionaCompra(double qtd, double valor, String nome)
		total = total + valor * qtd;
		itens = itens + "/n" + nome + "/t" + (qtd*valor);
	}
}
