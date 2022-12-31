package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist1 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(57);
		list.add(77);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
