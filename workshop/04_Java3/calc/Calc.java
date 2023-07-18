package calc;

public class Calc {
	public int calculate(int data) {
		int sum_even = 0;
		for (int i=1; i<=data; i++) {
			if(i%2==0) {
				sum_even += i;
			}
		}
		return sum_even;
	}
}
