import java.util.PriorityQueue;

public class Algo03_linear_PriorityQueue {

	public static void main(String[] args) {
		
		// PriorityQueue
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(3);
		q.add(7);
		q.add(22);
		q.add(13);
		q.add(1);
		q.add(21);
		System.out.println(q);
		for (int i=0; i<6; i++) {
			System.out.println(q.poll());
		}
		
	}

}
