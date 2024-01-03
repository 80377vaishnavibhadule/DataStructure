package assignment;

public class q3 {
	 public static int linearSearchComparisons(int[] arr, int key) {
	        int comparisons = 0;

	        for (int i = 0; i < arr.length; i++) {
	            comparisons++;
	            if (arr[i] == key) {
	                return comparisons;
	            }
	        }

	        return comparisons;
	    }

	    public static int binarySearchComparisons(int[] arr, int key) {
	        int comparisons = 0;
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            comparisons++;

	            if (arr[mid] == key) {
	                return comparisons;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return comparisons;
	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int key = 7;

	        int linearComparisons = linearSearchComparisons(sortedArray, key);
	        int binaryComparisons = binarySearchComparisons(sortedArray, key);

	        System.out.println("Linear Search Comparisons: " + linearComparisons);
	        System.out.println("Binary Search Comparisons: " + binaryComparisons);
	    }
}
