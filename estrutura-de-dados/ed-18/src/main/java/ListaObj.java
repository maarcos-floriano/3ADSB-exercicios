import java.util.Arrays;

public class ListaObj<T> {

    private T[] vetor;   // Vetor genérico para armazenar os elementos
    private int nroElem; // Número de elementos na lista

    public ListaObj(int tamanho) {
        vetor = (T[]) new Object[tamanho]; // Cria o vetor com o tamanho especificado
        nroElem = 0;                       // Inicializa o número de elementos
    }

    public void adiciona(T elemento) {
        if (nroElem >= vetor.length) {
            throw new IllegalStateException("Lista cheia");
        }
        vetor[nroElem++] = elemento; // Adiciona o elemento e incrementa o número de elementos
    }

    public int busca(T elementoBuscado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(elementoBuscado)) {
                return i; // Retorna o índice se o elemento for encontrado
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return false; // Índice inválido
        }
        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1]; // Desloca os elementos à esquerda
        }
        vetor[--nroElem] = null; // Decrementa nroElem e remove o último elemento
        return true;
    }

    public boolean removeElemento(T elementoARemover) {
        int indice = busca(elementoARemover);
        if (indice == -1) {
            return false; // Elemento não encontrado
        }
        return removePeloIndice(indice); // Remove o elemento pelo índice
    }

    public int getTamanho() {
        return nroElem; // Retorna o número de elementos na lista
    }

    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return null; // Índice inválido
        }
        return vetor[indice]; // Retorna o elemento no índice especificado
    }

    public void limpa() {
        Arrays.fill(vetor, null); // Limpa o vetor, preenchendo com null
        nroElem = 0;              // Reseta o número de elementos
    }

    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]); // Exibe cada elemento da lista
        }
    }

    public T[] getVetor() {
        return vetor;
    }
}
