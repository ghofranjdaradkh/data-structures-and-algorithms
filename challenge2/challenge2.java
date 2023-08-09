
package challenge2;

import java.util.Arrays;

public class challenge2 {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, -8};
        int[] result1 = insertShiftArray(arr1, 5);
        
        int[] arr2 = {42, 8, 15, 23, 42};
        int[] result2 = insertShiftArray(arr2, 16);
        
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    public static int[] insertShiftArray(int[] arr, int num) {
        int middleIndex = arr.length / 2;
        int[] newArr = new int[arr.length + 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
           
            if (i == middleIndex) {
                newArr[j++] = num;
            }
            newArr[j++] = arr[i];
        }
        return newArr;}}
    
    

