import java.util.Arrays;

class MyStack {
	int top;
	int size;
	int [] stack;
	
	public MyStack(int size) {
		this.size = size;
		stack = new int [size];
		top = -1;
	}
	
	// 저장 : top 증가 + 값 저장
	public void push(int n) {
		++top;
		stack[top] = n;
	}
	
	// 삭제 : top 감소 + 값 삭제
	public void pop() {
		stack[top--] = 0;
	}
	
	// 현재 top의 값 반환
	public int peek() {
		return stack[top];
	}
}

public class Algo03_linear_Stack {

	public static void main(String[] args) {
		
		// Stack
		MyStack stack = new MyStack(5);
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(4);
		System.out.println(Arrays.toString(stack.stack));
		System.out.println(stack.peek());
		
		for(int i=0; i<stack.size; i++) {
			stack.pop();
		}
		System.out.println(Arrays.toString(stack.stack));
		
	}

}
