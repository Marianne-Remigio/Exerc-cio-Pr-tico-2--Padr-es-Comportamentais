package org.example.command;


// TODO: Você está desenvolvendo um aplicativo que permite ao usuário realizar comandos como:
//  - Criar um arquivo
//  - Renomear um arquivo
//  - Excluir um arquivo
//  .
//  APlique o padrão Command para que o usuário consiga adicionar novos comandos facilmente


public class Main {

    public static void main(String[] args) {

        SistemaDeArquivos sistema = new SistemaDeArquivos();
        EditorDeArquivos editor = new EditorDeArquivos();

        Comando criar = new CriarArquivoCommand(sistema, "documento.txt");
        Comando renomear = new RenomearArquivoCommand(sistema, "documento.txt");

        editor.executarComando(criar);
        editor.executarComando(renomear);
    }
}

