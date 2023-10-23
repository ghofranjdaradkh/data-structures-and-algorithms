package insertionsort;

public class InsertionSort {


    public  int[] insertionSort(int[] input) {
        int[] sorted = new int[input.length];
        sorted[0] = input[0];

        for (int i = 1; i < input.length; i++) {
            insert(sorted, input[i], i);
        }

        return sorted;
    }

    public  void insert(int[] sorted, int value, int currentIndex) {
        int i = currentIndex;

        while (i > 0 && value < sorted[i - 1]) {
            sorted[i] = sorted[i - 1];
            i--;
        }

        sorted[i] = value;
    }
}




