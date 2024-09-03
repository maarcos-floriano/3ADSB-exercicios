public class InsertionSort {

    public static void ordenarPorInsercao(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }

    public static void exibirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Array original:");
        exibirArray(array);

        ordenarPorInsercao(array);

        System.out.println("Array ordenado:");
        exibirArray(array);
    }

}
