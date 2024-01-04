package dsa3;


	import java.util.Stack;

	public class q2_assignment3 {
	    public static void reverseArray(int[] array) {
	        Stack<Integer> stack = new Stack<>();

	        // Push elements onto the stack
	        for (int i : array) {
	            stack.push(i);
	        }

	        // Pop elements from the stack to reverse the array
	        for (int i = 0; i < array.length; i++) {
	            array[i] = stack.pop();
	        }
	    }

	    public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        
	        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));

	        // Reverse the array using a stack
	        reverseArray(originalArray);

	        System.out.println("Reversed Array: " + java.util.Arrays.toString(originalArray));
	    }
	
}
