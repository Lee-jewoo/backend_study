import java.util.Stack;

public class Algo03_linear_Stack2 {

	public static void main(String[] args) {
		
		// Stack API
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		
	}

}
