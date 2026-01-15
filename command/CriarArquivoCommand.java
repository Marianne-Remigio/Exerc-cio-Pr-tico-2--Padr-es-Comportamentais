package org.example.command;

public class CriarArquivoCommand implements Comando {

    private SistemaDeArquivos sistema;
    private String nome;

    public CriarArquivoCommand(SistemaDeArquivos sistema, String nome) {
        this.sistema = sistema;
        this.nome = nome;
    }

    @Override
    public void executar() {
        sistema.criar(nome);
    }
}
