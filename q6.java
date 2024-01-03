public class LinearSearchNthOccurrence {

    public static int linearSearchNthOccurrence(int[] arr, int key, int n) {
        int occurrenceCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                occurrenceCount++;

                if (occurrenceCount == n) {
                    return i; // Return the index of the nth occurrence
                }
            }
        }

        return -1; // Nth occurrence not found
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 2, 5, 6, 2, 7};
        int searchKey = 2;
        int nthOccurrence = 3;

        int result = linearSearchNthOccurrence(myArray, searchKey, nthOccurrence);

        if (result != -1) {
            System.out.println("The " + nthOccurrence + " occurrence of " + searchKey + " is at index " + result + ".");
        } else {
            System.out.println("The " + nthOccurrence + " occurrence of " + searchKey + " is not found in the array.");
        }
    }
}

