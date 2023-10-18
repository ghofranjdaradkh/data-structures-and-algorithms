package mergesort;

public class Library {
    public static void main(String[] args) {
        mergeSort mergeSort = new mergeSort();

        int[] arr = {20,18,12,8,5,-2};
        int[] arr2= {5,12,7,5,5,7};
        int [] arr3={2,3,5,7,13,11};
        mergeSort.mergeSort(arr);
        mergeSort.mergeSort(arr2);
        mergeSort.mergeSort(arr3);
        System.out.println("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }



        System.out.println("\nSorted array 2:");
        for (int value : arr2) {
            System.out.print(value + " ");
        }

        System.out.println("\nSorted array 3:");
        for (int value : arr3) {
            System.out.print(value + " ");
        }
    }
}
