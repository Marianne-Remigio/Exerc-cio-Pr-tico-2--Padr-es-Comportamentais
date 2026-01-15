package org.example.chain;

public class AutorizacaoValidador extends Validador {

    @Override
    public void validar(Requisicao requisicao) {
        if (!requisicao.autorizado) {
            System.out.println("Usuário sem permissão.");
            return;
        }

        if (proximo != null) {
            proximo.validar(requisicao);
        }
    }
}
