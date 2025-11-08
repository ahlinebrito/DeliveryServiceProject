package delivery;

public class PedidoPago implements EstadoPedido {
    public void avancar(Pedido pedido) {
        pedido.setEstado(new PedidoEmTransito());
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new PedidoCancelado());
    }
    public String nome() { return "Pago"; }
}
