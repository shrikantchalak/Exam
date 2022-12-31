package dataStructure;

public class SingliLinkList {

	Node head;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;

		}
	}

	public void addFirst(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
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
	}

	public void display() {
		Node currNode = head;
		System.out.println("Forward Direction");
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
	}

	public Node reverse(SingliLinkList list) {
		if (head == null) {
			return head;
		}

		Node currNode = head;
		Node prevNode = null;

		System.out.println("Reverse The List");

		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
			System.out.print(currNode.data + "->");

		}
		return prevNode;

	}

	public static void main(String[] args) {

		SingliLinkList list = new SingliLinkList();

		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");

		// list.display();
		System.out.println();
		list.reverse(list);

	}

}
