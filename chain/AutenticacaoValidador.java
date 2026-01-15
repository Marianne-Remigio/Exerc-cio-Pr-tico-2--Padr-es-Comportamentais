package org.example.chain;

public class AutenticacaoValidador extends Validador {

    @Override
    public void validar(Requisicao requisicao) {
        if (!requisicao.autenticado) {
            System.out.println("Usuário não autenticado.");
            return;
        }

        if (proximo != null) {
            proximo.validar(requisicao);
        }
    }
}
