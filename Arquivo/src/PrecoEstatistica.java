public class PrecoEstatistica {
    private double maximo;
    private double minimo;
    private double somaPrecos;
    private int cotacoes;
    private String nomeProduto;

    public PrecoEstatistica(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        this.minimo = double.MAX_VALUE;
        this.maximo = double.MIN_VALUE;
        this.somaPrecos = 0;
        this.cotacoes = 0;
    }

    public void adicionarPreco(double preco) {
        if (preco > maximo) {
            maximo = preco;
        }
        if (preco < minimo) {
            minimo = preco;
        }
        somarPrecos += preco;
        cotacoes++;
    }

    public double getMedia() {
        return somaPrecos / cotacoes;
    }

    public double getMaximo() {
        return maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public int getCotacoes() {
        return cotacoes
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto +
                ", Máximo: " + maximo +
                ", Mínimo: " + minimo +
                ", Média: " + getMedia() +
                ", Cotacoes: " + cotacoes;
    }
}
