package delivery;

public class Pedido {
    private long id;
    private Cliente cliente;
    private EstadoPedido estado;
    private PagamentoStrategy pagamento;
    private double valor;

    public Pedido(long id, Cliente cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.estado = new PedidoCriado();
    }

    public void pagar() {
        if (pagamento != null && pagamento.pagar(valor)) {
            avancarEstado();
        }
    }

    public void avancarEstado() {
        estado.avancar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void setEstado(EstadoPedido novoEstado) {
        this.estado = novoEstado;
        cliente.notificar(this, novoEstado);
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setPagamento(PagamentoStrategy pagamento) {
        this.pagamento = pagamento;
    }
}
