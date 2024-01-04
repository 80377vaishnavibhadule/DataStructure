package dsa3;
import java.util.Stack;

public class q1_assignment3 {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public q1_assignment3() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int element) {
        stack.push(element);
        if (maxStack.isEmpty() || element >= maxStack.peek()) {
            maxStack.push(element);
        } else {
            maxStack.push(maxStack.peek());
        }
    }

    public Integer pop() {
        if (stack.isEmpty()) {
            return null;
        }
        maxStack.pop();
        return stack.pop();
    }

    public Integer getMax() {
        if (maxStack.isEmpty()) {
            return null;
        }
        return maxStack.peek();
    }

    public static void main(String[] args) {
    	q1_assignment3 q1_assignment3 = new q1_assignment3();

        // Insert 5 elements
    	q1_assignment3.push(3);
    	q1_assignment3.push(7);
    	q1_assignment3.push(2);
    	q1_assignment3.push(8);
    	q1_assignment3.push(1);

        // Find the maximum value without traversing the stack
        Integer max = q1_assignment3.getMax();
        System.out.println("Maximum value in the stack: " + max);
    }
}
