package delivery;

public class PagamentoDinheiro implements PagamentoStrategy {
    public boolean pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " em dinheiro recebido.");
        return true;
    }
}
