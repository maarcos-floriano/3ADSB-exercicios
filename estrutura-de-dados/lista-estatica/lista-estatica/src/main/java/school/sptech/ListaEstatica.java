package school.sptech;

public class ListaEstatica {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tamanho) {
        this.vetor = new int[tamanho];
        this.nroElem = 0;
    }

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            throw new IllegalStateException("Lista cheia");
        }
        vetor[nroElem++] = elemento;
    }

    public void exibe() {
        if (nroElem == 0) {
            System.out.println("A lista está vazia.");
        } else {
            for (int i = 0; i < nroElem; i++) {
                System.out.println(vetor[i]);
            }
        }
    }

    public int busca(int elemento) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("Índice inválido.");
            return false;
        }
        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        nroElem--;
        return true;
    }

    public boolean removeElemento(int elemento) {
        int indice = busca(elemento);
        if (indice == -1) {
            System.out.println("Elemento não encontrado.");
            return false;
        }
        return removePeloIndice(indice);
    }

    public boolean listaCheia() {
        return nroElem >= vetor.length;
    }

    public boolean listaVazia() {
        return nroElem == 0;
    }
}
