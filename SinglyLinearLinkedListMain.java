package dsa;

public class SinglyLinearLinkedListMain {

	public static void main(String[] args) {

		List l1 = new List();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		//10 -> 20 -> 30 -> 40
		l1.addLast(50);
		l1.addLast(60);
		//10 -> 20 -> 30 -> 40 -> 50 -> 60
		
		//l1.deleteFirst();
		//l1.deleteLast();
		//l1.addPosition(100, 8);
		l1.deletePosition(7);
		
		l1.display();
		
		l1.deleteAll();

	}

}