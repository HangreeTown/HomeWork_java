/*


    - Реализовать алгоритм сортировки слиянием
    

*/


import java.util.Arrays;

public class DZ_3_1 {
    public static void main(String[] args) {
        int[] array = {22,0,3,9,12,88,43,4,11,33,11};
        System.out.println("Исходный массив -> " + Arrays.toString(array));
        int[] result = MergeSort(array);
        System.out.println("Отсортированный массив -> " + Arrays.toString(result));
    }

    public static int[] MergeSort(int [] args) {
        int[] temp; 
        int[] currentArray = args; 
        int[] bufferArray = new int[args.length]; 

        int size = 1; 
        while (size < args.length) {
            for (int i = 0; i < args.length; i += 2 * size) { 
                merge(currentArray, i, currentArray, i + size, bufferArray, i, size); 
            }

            temp = currentArray;
            currentArray = bufferArray;
            bufferArray = temp;

            size = size * 2;

            
        }
        return currentArray;
    }

    private static void merge(int[] arr1, int arr1Start, int[] arr2, int arr2Start, int[] buffer,
                              int bufferStart, int size) {
        int index1 = arr1Start; 
        int index2 = arr2Start;

        int arr1End = Math.min(arr1Start + size, arr1.length); 
        int arr2End = Math.min(arr2Start + size, arr2.length); 

        if (arr1Start + size > arr1.length) {
            for (int i = arr1Start; i < arr1End; i++) {
                buffer[i] = arr1[i];
            }
            return;
        }
        int iterationCount = arr1End - arr1Start + arr2End - arr2Start;

        for (int i = bufferStart; i < bufferStart + iterationCount; i++) {
            if (index1 < arr1End && (index2 >= arr2End || arr1[index1] < arr2[index2])) {
                buffer[i] = arr1[index1];
                index1++;
            } else {
                buffer[i] = arr2[index2];
                index2++;
            }
        }
    }
}