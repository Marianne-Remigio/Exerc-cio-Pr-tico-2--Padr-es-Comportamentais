package org.example.chain;

public class DadosValidador extends Validador {

    @Override
    public void validar(Requisicao requisicao) {
        if (!requisicao.dadosValidos) {
            System.out.println("Dados inválidos.");
            return;
        }

        System.out.println("Requisição processada com sucesso!");
    }
}
