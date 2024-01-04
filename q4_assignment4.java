package dsa;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedLinkedList {
    Node head;

    public void insertSorted(int value) {
        Node newNode = new Node(value);

        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class q4_assignment4 {
    public static void main(String[] args) {
        SortedLinkedList sortedList = new SortedLinkedList();

        sortedList.insertSorted(3);
        sortedList.insertSorted(1);
        sortedList.insertSorted(5);
        sortedList.insertSorted(2);
        sortedList.insertSorted(4);

        System.out.println("Sorted Linked List:");
        sortedList.displayList();
    }
}

