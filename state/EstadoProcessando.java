package org.example.state;

public class EstadoProcessando implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        pedido.setEstado(new EstadoEnviado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
        System.out.println("Pedido cancelado.");
    }

    @Override
    public String getNome() {
        return "Processando";
    }
}
