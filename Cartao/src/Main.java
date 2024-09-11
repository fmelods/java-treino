public class Main {
    public static void main(String[] args) {
        CartaoPrePago cartao = new CartaoPrePago("123456789", "12/25", "123", "Felipe Melo", 5000);

        try {
            System.out.println("Saldo inicial: " + cartao.getSaldo());
            cartao.deposito(4000);
            System.out.println("Saldo após depósito: " + cartao.getSaldo());

            cartao.deposito(2000);
        } catch (OverflowBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            cartao.pagamento(3000);
            System.out.println("Saldo após pagamento: " + cartao.getSaldo());

            cartao.pagamento(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
