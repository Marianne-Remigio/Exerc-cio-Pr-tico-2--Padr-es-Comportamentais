package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente, Usuario destinatario) {

        if (!usuarios.contains(destinatario)) {
            System.out.println("Usuário " + destinatario.getNome() + " não está no chat.");
            return;
        }

        destinatario.receberMensagem(mensagem, remetente);
    }
}
