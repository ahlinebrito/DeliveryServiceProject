package delivery;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void notificar(Pedido pedido, EstadoPedido estado) {
        System.out.println("Cliente " + nome + " notificado: Pedido está agora " + estado.nome());
    }
}
