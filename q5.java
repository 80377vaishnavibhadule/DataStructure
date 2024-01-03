public class BinarySearchDescending {

    public static int binarySearchDescending(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                high = mid - 1; // Adjust for descending order
            } else {
                low = mid + 1; // Adjust for descending order
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] descendingArray = {10, 8, 6, 4, 2, 0, -2, -4, -6, -8};

        int keyToSearch = -2;

        int result = binarySearchDescending(descendingArray, keyToSearch);

        if (result != -1) {
            System.out.println("Element " + keyToSearch + " found at index " + result);
        } else {
            System.out.println("Element " + keyToSearch + " not found in the array");
        }
    }
}

