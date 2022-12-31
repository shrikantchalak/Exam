package dataStructure;

public class LL {

	Node head;

	class Node {
		String data;
		Node next;
		Node prev;

		Node(String data) {
			this.data = data;
			this.next = null;
			this.prev = null;

		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	public void addMid(String data, int pos) {
		Node newNode = new Node(data);
		Node currNode = head;
		if (head == null) {
			head = newNode;
			return;
		}

		for (int i = 0; i < pos - 1; i++) {
			currNode = currNode.next;
		}

		newNode.next = currNode.next;
		currNode.next = newNode;
		newNode.next.prev = newNode;
		newNode.prev = currNode;
	}

	public void addLast(String data) {

		Node newNode = new Node(data);
		Node currNode;
		if (head == null) {
			head = newNode;
			return;
		}

		currNode = head;

		while (currNode.next != null) {
			currNode = currNode.next;
		}

		currNode.next = newNode;
		newNode.prev = currNode;

	}

	public void delete(int pos) {
		Node currNode = head;
		if (pos == 0) {
			head = head.next;
		}

		for (int i = 0; i < pos - 1; i++) {
			currNode = currNode.next;
		}

		currNode.next = currNode.next.next;
		currNode.next.next.prev = currNode;
	}

	public void display() {
		Node currNode = head;
		Node revNode = null;

		System.out.println("Forward Direction");

		while (currNode != null) {
			System.out.print(currNode.data + "->");
			revNode = currNode;
			currNode = currNode.next;
		}
		System.out.println();

		System.out.println("Reverse Direction");

		while (revNode != null) {
			System.out.print(revNode.data + "->");
			revNode = revNode.prev;
		}
	}

	public static void main(String[] args) {

		LL list = new LL();

		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");

		list.display();

	}

}
