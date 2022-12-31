package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(57);
		queue.add(77);
		queue.add(10);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);

		System.out.println("Head Element " + queue.element());

//		queue.remove();  
//		queue.poll();  

		Iterator itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
