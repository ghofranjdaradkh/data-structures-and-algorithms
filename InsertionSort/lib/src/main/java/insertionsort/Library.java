package insertionsort;

public class Library {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] input = {15, 21, 14, 6, 11, 3};
        int[] sorted = insertionSort.insertionSort(input);
        for (int value : sorted) {
            System.out.print(value + " ");
        }
    }
}
