package example;

public class Main {
    public static void main(String[] args) {
        int[] vetorOriginal = {2, 5, 3, 6, 1};
        
        int[] vetorParaSelectionSort = vetorOriginal.clone();
        int[] vetorParaSelectionSortOtimizado = vetorOriginal.clone();
        int[] vetorParaBubbleSort = vetorOriginal.clone();
        
        System.out.println("Ordenando com Selection Sort:");
        selectionSort(vetorParaSelectionSort);
        exibirVetor(vetorParaSelectionSort);
        
        System.out.println("\nOrdenando com Selection Sort Otimizado:");
        selectionSortOtimizado(vetorParaSelectionSortOtimizado);
        exibirVetor(vetorParaSelectionSortOtimizado);
        
        System.out.println("\nOrdenando com Bubble Sort:");
        bubbleSort(vetorParaBubbleSort);
        exibirVetor(vetorParaBubbleSort);
    }
    
    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
                trocas++;
            }
        }

        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }

    public static void selectionSortOtimizado(int[] vetor) {
        int n = vetor.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            boolean trocou = false;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
                trocas++;
                trocou = true;
            }
            if (!trocou) {
                break;
            }
        }

        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        int comparacoes = 0;
        int trocas = 0;

        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);

        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }

    public static void exibirVetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
