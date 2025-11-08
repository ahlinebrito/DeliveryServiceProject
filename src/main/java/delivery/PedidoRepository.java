package delivery;

import java.util.HashMap;
import java.util.Map;

public class PedidoRepository {
    private static PedidoRepository instancia;
    private Map<Long, Pedido> pedidos = new HashMap<>();

    private PedidoRepository() {}

    public static PedidoRepository getInstancia() {
        if (instancia == null) {
            instancia = new PedidoRepository();
        }
        return instancia;
    }

    public void salvar(Pedido pedido) {
        pedidos.put(pedido.hashCode() * 1L, pedido);
    }
}
