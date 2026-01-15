package org.example.command;

public class RenomearArquivoCommand implements Comando {

    private SistemaDeArquivos sistema;
    private String nome;

    public RenomearArquivoCommand(SistemaDeArquivos sistema, String nome) {
        this.sistema = sistema;
        this.nome = nome;
    }

    @Override
    public void executar() {
        sistema.renomear(nome);
    }
}
