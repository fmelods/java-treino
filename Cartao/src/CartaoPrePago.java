public class CartaoPrePago {
    private String numero;
    private String validade;
    private String codigo;
    private String nome;
    private double saldo;

    private static final double valorMaximo = 10000;

    public CartaoPrePago(String numero, String validade, String codigo, String nome, double saldo) {
        this.numero = numero;
        this.validade = validade;
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void pagamento(double valor) throws InsufficientBalanceException {
        if (valor > saldo) {
            throw new InsufficientBalanceException("Saldo insuficiente para o pagamento.");
        }
        saldo -= valor;
    }

    public void deposito(double valor) throws OverflowBalanceException {
        if (saldo + valor > valorMaximo) {
            throw new OverflowBalanceException("Depósito excede o saldo máximo permitido.");
        }
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}