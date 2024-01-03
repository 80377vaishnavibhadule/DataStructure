package assignment;

import java.util.Arrays;

public class InsertionSort {

    public static int insertionSort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                comparisons++; 
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return comparisons;
    }

    public static void main(String[] args) {
        int[] myArray = {64, 25, 12, 22, 11};
        int comparisonCount = insertionSort(myArray);

        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Sorted Array: " + Arrays.toString(myArray));
        System.out.println("Number of comparisons: " + comparisonCount);
    }
}

