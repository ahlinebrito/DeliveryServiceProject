package delivery;

public class PedidoCancelado implements EstadoPedido {
    public void avancar(Pedido pedido) { }
    public void cancelar(Pedido pedido) { }
    public String nome() { return "Cancelado"; }
}
