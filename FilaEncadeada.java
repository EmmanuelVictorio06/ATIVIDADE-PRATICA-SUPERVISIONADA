public class FilaEncadeada {
    Fila inicio;
    private Fila fim;

    public void insere(int valor) {
        Fila novo = new Fila(valor);
        if (fim != null) {
            fim.proximo = novo;
        } else {
            inicio = novo;
        }
        fim = novo;
        System.out.println("Inserido: " + valor);
    }

    public int remove() {
        if (inicio == null) {
            System.out.println("Erro: Fila vazia");
            return -1;
        }
        int valor = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        System.out.println("Removido: " + valor);
        return valor;
    }

    public void imprime() {
        System.out.print("Fila: ");
        Fila atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();
        fila.insere(5);
        fila.insere(15);
        fila.insere(23);
        fila.imprime();

        fila.remove();
        fila.imprime();
    }
}