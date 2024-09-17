package AgendaTelefonica;

public class Agenda {
    private Contato[] contatos;
    private int quantidadeContatos;
    private static final int MAX_CONTATOS = 100;

    public Agenda() {
        contatos = new Contato[MAX_CONTATOS];
        quantidadeContatos = 0;
    }

    public void adicionarContato(String nome, String telefone) throws AgendaCheiaException {
        if (quantidadeContatos >= MAX_CONTATOS) {
            throw new AgendaCheiaException("A agenda está cheia. Não é possível adicionar mais contatos.");
        }
        contatos[quantidadeContatos++] = new Contato(nome, telefone);
    }

    public void removerContato(String nome) throws ContatoNaoEncontradoException {
        int index = buscarContatoIndex(nome);
        if (index == -1) {
            throw new ContatoNaoEncontradoException("Contato com nome " + nome + " não encontrado.");
        }
        for (int i = index; i < quantidadeContatos - 1; i++) {
            contatos[i] = contatos[i + 1];
        }
        contatos[--quantidadeContatos] = null; // Limpa o último contato
    }

    public Contato buscarContato(String nome) throws ContatoNaoEncontradoException {
        int index = buscarContatoIndex(nome);
        if (index == -1) {
            throw new ContatoNaoEncontradoException("Contato com nome " + nome + " não encontrado.");
        }
        return contatos[index];
    }

    public void listarContatos() {
        if (quantidadeContatos == 0) {
            System.out.println("A agenda está vazia.");
        } else {
            for (int i = 0; i < quantidadeContatos; i++) {
                System.out.println(contatos[i]);
            }
        }
    }

    private int buscarContatoIndex(String nome) {
        for (int i = 0; i < quantidadeContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
}

