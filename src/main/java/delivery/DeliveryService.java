package delivery;

public class DeliveryService {
    private PedidoRepository repository = PedidoRepository.getInstancia();

    public Pedido criarPedido(Cliente cliente, double valor) {
        Pedido pedido = new Pedido(System.currentTimeMillis(), cliente, valor);
        repository.salvar(pedido);
        return pedido;
    }
}
