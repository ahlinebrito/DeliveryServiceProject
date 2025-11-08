package delivery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void fluxoCompletoEntrega() {
        Cliente c = new Cliente("Aline", "aline@example.com");
        Pedido p = new Pedido(1, c, 100);
        p.setPagamento(new PagamentoCartao());
        p.pagar();
        p.avancarEstado();
        p.avancarEstado();
        assertEquals("Entregue", p.getEstado().nome());
    }

    @Test
    public void deveCancelarAntesDoPagamento() {
        Cliente c = new Cliente("João", "joao@example.com");
        Pedido p = new Pedido(2, c, 50);
        p.cancelar();
        assertEquals("Cancelado", p.getEstado().nome());
    }


    @Test
    public void fluxoCompletoEntregaComDinheiro() {
        Cliente c = new Cliente("Maria", "maria@example.com");
        Pedido p = new Pedido(3, c, 80);
        p.setPagamento(new PagamentoDinheiro());
        p.pagar();
        p.avancarEstado();
        p.avancarEstado();
        assertEquals("Entregue", p.getEstado().nome());
    }


    @Test
    public void fluxoCompletoEntregaComPayPal() {
        Cliente c = new Cliente("Carlos", "carlos@example.com");
        Pedido p = new Pedido(4, c, 120);
        p.setPagamento(new PagamentoPayPal());
        p.pagar();
        p.avancarEstado();
        p.avancarEstado();
        assertEquals("Entregue", p.getEstado().nome());
    }
}
