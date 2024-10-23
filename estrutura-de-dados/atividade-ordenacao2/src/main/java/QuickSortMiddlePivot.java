public class QuickSortMiddlePivot {

    // Função para fazer a partição do array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Escolhendo o último elemento como pivô
        int i = low - 1;  // Índice do menor elemento

        for (int j = low; j < high; j++) {
            // Se o elemento atual for menor que o pivô, troca com o elemento de i
            if (array[j] < pivot) {
                i++;
                // Troca array[i] e array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Coloca o pivô na posição correta
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;  // Retorna o índice do pivô
    }

    // Função principal do QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Particiona o array e obtém o índice do pivô
            int pi = partition(array, low, high);

            // Ordena as duas metades recursivamente
            quickSort(array, low, pi - 1);  // Antes do pivô
            quickSort(array, pi + 1, high); // Depois do pivô
        }
    }

}
