package org.example.mediator;

public class Main {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        Usuario maria = new Usuario("Maria", mediator);
        Usuario joao = new Usuario("João", mediator);
        Usuario carlos = new Usuario("Carlos", mediator);

        mediator.adicionarUsuario(maria);
        mediator.adicionarUsuario(joao);
        mediator.adicionarUsuario(carlos);

        maria.enviaMensagem("Olá, João!", joao);
        joao.enviaMensagem("Oi, Carlos!", carlos);
        carlos.enviaMensagem("Bom dia, Maria!", maria);
    }
}
