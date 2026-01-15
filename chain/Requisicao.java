package org.example.chain;

public class Requisicao {

    public String usuario;
    public boolean autenticado;
    public boolean autorizado;
    public boolean dadosValidos;

    public Requisicao(String usuario, boolean autenticado, boolean autorizado, boolean dadosValidos) {
        this.usuario = usuario;
        this.autenticado = autenticado;
        this.autorizado = autorizado;
        this.dadosValidos = dadosValidos;
    }
}
