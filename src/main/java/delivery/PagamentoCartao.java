package delivery;

public class PagamentoCartao implements PagamentoStrategy {
    public boolean pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Cartão aprovado.");
        return true;
    }
}
