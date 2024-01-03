package assignment;

import java.util.Arrays;

public class InsertionSortDescending {

    public static int insertionSortDescending(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                comparisons++; // Increment comparison count for each comparison made
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return comparisons;
    }

    public static void main(String[] args) {
        int[] myArray = {50, 20, 10, 99};
       

        System.out.println("Original Array: " + Arrays.toString(myArray));
        int comparisonCount = insertionSortDescending(myArray);
        System.out.println("Sorted Array (Descending): " + Arrays.toString(myArray));
        System.out.println("Number of comparisons: " + comparisonCount);
    }
}

