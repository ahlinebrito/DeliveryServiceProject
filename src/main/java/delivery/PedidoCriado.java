package delivery;

public class PedidoCriado implements EstadoPedido {
    public void avancar(Pedido pedido) {
        pedido.setEstado(new PedidoPago());
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new PedidoCancelado());
    }
    public String nome() { return "Criado"; }
}
