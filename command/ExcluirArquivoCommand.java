package org.example.command;

public class ExcluirArquivoCommand implements Comando {

    private SistemaDeArquivos sistema;
    private String nome;

    public ExcluirArquivoCommand(SistemaDeArquivos sistema, String nome) {
        this.sistema = sistema;
        this.nome = nome;
    }

    @Override
    public void executar() {
        sistema.excluir(nome);
    }
}
