package org.example.state;

public interface EstadoPedido {

    void avancar(Pedido pedido);
    void cancelar(Pedido pedido);
    String getNome();
}
