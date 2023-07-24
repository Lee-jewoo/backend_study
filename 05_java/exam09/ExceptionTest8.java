package exam09;

import java.util.Random;

class MyRandom{
	public void rand() {
		Random r = new Random();
		int n = r.nextInt(3);
		if (n==0) throw new RuntimeException("0이 출력되었습니다.");
		System.out.println(n);
				
	}
}

public class ExceptionTest8 {

	public static void main(String[] args) {
		
		MyRandom x = new MyRandom();
		try {
			x.rand();		
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
