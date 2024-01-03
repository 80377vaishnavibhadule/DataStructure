import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

    public static int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                return num; // First non-repeating element found
            }
        }

        return -1; // No non-repeating element found
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        int result = findFirstNonRepeating(inputArray);

        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found in the array.");
        }
    }
}

