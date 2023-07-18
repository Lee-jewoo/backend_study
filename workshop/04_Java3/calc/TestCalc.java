package calc;

public class TestCalc {

	public static void main(String[] args) {
		Calc c = new Calc();
		int data = Integer.parseInt(args[0].toString());
		System.out.println("결과: "+c.calculate(data));
	}

}
