import java.util.Arrays;

public class challenge1 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int[] revArr1 = reverseArray(arr1);
        int arr2[] = {89, 2354, 3546, 23, 10, -923, 823, -12};
        int[] revArr2 = reverseArray(arr2);
        int arr3[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
            73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149,
             151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        int[] revArr3 = reverseArray(arr3);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("revArr1: " +Arrays.toString(revArr1) );
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("revArr2: " + Arrays.toString(revArr2) );
        System.out.println("arr3: " + Arrays.toString(arr3) );
        System.out.println("revArr3: " +Arrays.toString(revArr3)  );
    }

    public static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[j];
            j--;
        }
        return revArr;
    }
}

