package org.example.state;

public class EstadoEntregue implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        System.out.println("O pedido já foi entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("O pedido não pode ser cancelado.");
    }

    @Override
    public String getNome() {
        return "Entregue";
    }
}
