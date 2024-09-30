public class Registro implements Serializable {
    private String nomeProduto;
    private String estabelecimento;
    private double preco;

    public Registro(String nomeProduto, String estabelecimento, double preco) {
        this.nomeProduto = nomeProduto;
        this.estabelecimento = estabelecimento;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "nomeProduto ='" + nomeProduto + '\'' +
                ", estabelecimento = '" + estabelecimento + '\'' +
                ", preco=" + preco +
                '}';
    }
}
