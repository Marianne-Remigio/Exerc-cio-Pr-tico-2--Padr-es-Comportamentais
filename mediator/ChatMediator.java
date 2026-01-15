package org.example.mediator;

public interface ChatMediator {

    void enviarMensagem(String mensagem, Usuario remetente, Usuario destinatario);
    void adicionarUsuario(Usuario usuario);
}
