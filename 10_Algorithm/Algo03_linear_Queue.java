import java.util.LinkedList;
import java.util.Queue;

public class Algo03_linear_Queue {

	public static void main(String[] args) {
		
		// Queue
		// FIFO (First In First Out)
		// enqueue dequeue
		// 삽입 add : 저장할 때 문제가 있으면 예외 발생
		// 삽입 offer : 저장할 때 문제가 있으면 false 리턴
		// 삭제 remove : 삭제할 때 값이 없으면 예외 발생
		// 삭제 poll : 맨 처음 값 삭제 / 삭제할 때 값이 없으면 null 리턴
		// peek : 가장 앞에 있는 front값을 반환
		
		Queue<String> q = new LinkedList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("D");
		q.offer("E");

		System.out.println(q); // [A, B, C, D, E]
		System.out.println(q.peek()); // A
		System.out.println(q.remove("C")); // true
		System.out.println(q.remove()); // A
		System.out.println(q.poll()); // B
		
	}

}
