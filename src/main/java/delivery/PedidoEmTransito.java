package delivery;

public class PedidoEmTransito implements EstadoPedido {
    public void avancar(Pedido pedido) {
        pedido.setEstado(new PedidoEntregue());
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new PedidoCancelado());
    }
    public String nome() { return "Em trânsito"; }
}
