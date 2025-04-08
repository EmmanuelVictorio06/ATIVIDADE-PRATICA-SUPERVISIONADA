public class PilhaEncadeada {
    private Pilha topo;

    public void insere(int valor) {
        Pilha novo = new Pilha(valor);
        novo.proximo = topo;
        topo = novo;
        System.out.println("Inserido: " + valor);
    }

    public int remove() {
        if (topo == null) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        int valor = topo.dado;
        topo = topo.proximo;
        System.out.println("Removido: " + valor);
        return valor;
    }

    public void imprime() {
        System.out.print("Pilha: ");
        Pilha atual = topo;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.imprime();

        pilha.remove();
        pilha.imprime();
    }
}
