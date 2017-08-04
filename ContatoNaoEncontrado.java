package tela;


class ContatoNaoEncontrado extends Exception {
    public ContatoNaoEncontrado() {
        super("Contato não encontrado!");
    }

    public ContatoNaoEncontrado(String message) {
        super(message);
    }
}
