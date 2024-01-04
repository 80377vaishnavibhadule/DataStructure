package dsa3;

public class q4_assignment3 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public q4_assignment3(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = 0;
        currentSize = 0;
    }

//    public void enqueue(int item) {
//        if (isFull()) {
//            System.out.println("Queue is full. Cannot enqueue.");
//            return;
//        }
//
//        queueArray[rear] = item;
//        rear = (rear + 1) % maxSize;
//        currentSize++;
//
//        System.out.println("Enqueued: " + item);
//    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Assuming -1 represents an error or an invalid value
        }

        int item = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;

        System.out.println("Dequeued: " + item);
        return item;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        for (int count = 0; count < currentSize; count++) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        queueArray[rear] = item;
        rear = (rear + 1) % maxSize;
        currentSize++;

        System.out.println("Enqueued: " + item);
    }

    public static void main(String[] args) {
    	q4_assignment3 queue = new q4_assignment3(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); 
    }
}
