package org.example.chain;

public abstract class Validador {

    protected Validador proximo;

    public Validador setProximo(Validador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void validar(Requisicao requisicao);
}
