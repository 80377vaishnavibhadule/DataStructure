package assignment;

public class DescendingStack {

    private static final int SIZE = 10;
    private int[] stackArray;
    private int top;

    public DescendingStack() {
        stackArray = new int[SIZE];
        top = SIZE - 1; // Initialize top at the end of the array
    }

    public void push(int data) {
        if (top >= 0) {
            stackArray[top] = data;
            top--;
        } else {
            System.out.println("Stack Overflow. Cannot push " + data + " onto the stack.");
        }
    }

    public int pop() {
        if (top < SIZE - 1) {
            int poppedElement = stackArray[top + 1];
            top++;
            return poppedElement;
        } else {
            System.out.println("Stack Underflow. Cannot pop from an empty stack.");
            return -1; // Signifies an error or an empty stack
        }
    }

    public void display() {
        System.out.print("Stack (Descending): ");
        for (int i = SIZE - 1; i > top; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DescendingStack descendingStack = new DescendingStack();

        descendingStack.push(10);
        descendingStack.push(20);
        descendingStack.push(15);
        descendingStack.push(5);

        descendingStack.display();

        int poppedElement = descendingStack.pop();
        System.out.println("Popped Element: " + poppedElement);

        descendingStack.display();
    }
}

