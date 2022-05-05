import java.util.*;
class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
			
		}
	
	}

class reverse{
		
		
	Node head = null;
	Node prev;
	Node tail;
		
	
	void add(int data){
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			tail = head;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	
	void reverse(){
		if(head == null){
			System.out.println("Empty");
		}
		else{
			Node curr =head;
			prev = null;
			while( curr != null){
				Node temp1 = curr.next;
				curr.next = prev;
				curr = temp1;
			}
			}
		}

	void display(){
			Node temp =prev;
			while (temp != null){
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
	}		
	


	public static void main(String[] args){
	
		reverse rev = new reverse();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Element");
		int n = sc.nextInt();
		for(int i = 0; i< n ; i++){
			System.out.println("Enter the no");
			int k = sc.nextInt();
			rev.add(k);
		}
		rev.reverse();
		rev.display();
		
		
		
		
	}
	
}