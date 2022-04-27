package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i <= 10; i++) {
			q.add(i);
			System.out.println("Elements of Queue are : " + q);
		}
		int remove = q.remove();
		System.out.println("Removed Element : " + remove);
		System.out.println(q);

		int head = q.peek();
		System.out.println("Head of the queue: " + head);

		int size = q.size();
		System.out.println("Size of queue: " + size);
	}
}
