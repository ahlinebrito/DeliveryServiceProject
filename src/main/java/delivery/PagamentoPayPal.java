package delivery;

public class PagamentoPayPal implements PagamentoStrategy {
    public boolean pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via PayPal aprovado.");
        return true;
    }
}
