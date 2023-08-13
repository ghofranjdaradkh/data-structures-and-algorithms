package challenge3;
public class challenge3 {
    public static void main(String[] args) {

        int arr1[] = {4, 8, 15, 16, 23, 42};
        int arr2[] = {-131, -82, 0, 27, 42, 68, 179};
        int arr3[] = {11, 22, 33, 44, 55, 66, 77};
        int arr4[] = {1, 2, 3, 5, 6, 7};

        System.out.println(BinarySearch (arr1, 15));
        System.out.println(BinarySearch (arr2, 42));
        System.out.println(BinarySearch (arr3, 90));
        System.out.println(BinarySearch (arr4, 4));}

    public static int BinarySearch(int[] array, int searchKey) {

        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            int middleValue = array[middleIndex];

            if (searchKey == middleValue) {
                return middleIndex;
            } else if (searchKey < middleValue) {
                highIndex = middleIndex - 1;
            } else {
                lowIndex = middleIndex + 1;
            }}
        return -1;
    }
}

     
    

    

