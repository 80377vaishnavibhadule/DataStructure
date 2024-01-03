import java.util.Arrays;

public class SelectionSort {

    public static int selectionSort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++; // Increment comparison count for each comparison made

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return comparisons;
    }

    public static void main(String[] args) {
        int[] myArray = {64, 25, 12, 22, 11};
        int comparisonCount = selectionSort(myArray);

        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Sorted Array: " + Arrays.toString(myArray));
        System.out.println("Number of comparisons: " + comparisonCount);
    }
}

