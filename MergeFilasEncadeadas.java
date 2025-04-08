public class MergeFilasEncadeadas {
    public static FilaEncadeada merge(FilaEncadeada a, FilaEncadeada b) {
        FilaEncadeada c = new FilaEncadeada();

        Fila na = a.inicio;
        Fila nb = b.inicio;

        while (na != null && nb != null) {
            if (na.dado <= nb.dado) {
                c.insere(na.dado);
                na = na.proximo;
            } else {
                c.insere(nb.dado);
                nb = nb.proximo;
            }
        }

        while (na != null) {
            c.insere(na.dado);
            na = na.proximo;
        }

        while (nb != null) {
            c.insere(nb.dado);
            nb = nb.proximo;
        }

        return c;
    }

    public static void main(String[] args) {
        FilaEncadeada A = new FilaEncadeada();
        A.insere(12);
        A.insere(35);
        A.insere(52);
        A.insere(64);

        FilaEncadeada B = new FilaEncadeada();
        B.insere(5);
        B.insere(15);
        B.insere(23);
        B.insere(55);
        B.insere(75);

        FilaEncadeada C = merge(A, B);
        System.out.println("Fila C (Resultado do Merge):");
        C.imprime();
    }
}