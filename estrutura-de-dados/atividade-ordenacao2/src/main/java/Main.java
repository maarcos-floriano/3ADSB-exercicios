public class Main {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        int n = array.length;

        // Testando o MergeSort
        MergeSort.mergeSort(array, 0, n - 1);
        System.out.println("Array ordenado com MergeSort:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Testando o QuickSort com pivô do meio
        int[] array2 = {38, 27, 43, 3, 9, 82, 10};
        QuickSortMiddlePivot.quickSort(array2, 0, n - 1);
        System.out.println("Array ordenado com QuickSort (pivô no meio):");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Testando o QuickSort com pivô no final
        int[] array3 = {38, 27, 43, 3, 9, 82, 10};
        QuickSortLastPivot.quickSort(array3, 0, n - 1);
        System.out.println("Array ordenado com QuickSort (pivô no final):");
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }
}
