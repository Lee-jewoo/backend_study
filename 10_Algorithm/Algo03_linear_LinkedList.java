import java.util.LinkedList;

public class Algo03_linear_LinkedList {

	public static void main(String[] args) {
		
		// LinkedList
		
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(0, "a"); // 특정 위치에 삽입
		list.addFirst("Z"); // 처음에 삽입
		list.addLast("Z"); // 마지막에 삽입
		
		System.out.println(list);
		// 처음 값 삭제 -> 삭제한 값 반환
		System.out.println(list.removeFirst());
		// 마지막 값 삭제 -> 삭제한 값 반환
		System.out.println(list.removeLast());
		// 특정 값 삭제 -> true
		System.out.println(list.remove("a"));
		// 조건에 맞는 값 삭제 -> true
		System.out.println(list.removeIf(s->s.startsWith("A")));
		
	}

}
