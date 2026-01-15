package org.example.state;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        pedido.setEstado(new EstadoEntregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("O pedido não pode ser cancelado.");
    }

    @Override
    public String getNome() {
        return "Enviado";
    }
}
