package delivery;

public class PedidoEntregue implements EstadoPedido {
    public void avancar(Pedido pedido) { }
    public void cancelar(Pedido pedido) { }
    public String nome() { return "Entregue"; }
}
