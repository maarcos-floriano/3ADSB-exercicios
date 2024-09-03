public class BinarySearch {

    public static int pesquisarBinaria(int[] arrayOrdenado, int alvo) {
        int esquerda = 0;
        int direita = arrayOrdenado.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (arrayOrdenado[meio] == alvo) {
                return meio;
            }

            if (arrayOrdenado[meio] < alvo) {
                esquerda = meio + 1;
            }
            else {
                direita = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arrayOrdenado = {5, 6, 11, 12, 13};

        int alvo = 11;
        int resultado = pesquisarBinaria(arrayOrdenado, alvo);
        System.out.println("O índice do item " + alvo + " é " + resultado);

        alvo = 7;
        resultado = pesquisarBinaria(arrayOrdenado, alvo);
        System.out.println("O índice do item " + alvo + " é " + resultado);
    }

}
