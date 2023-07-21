package exam08_1;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random r = new Random();
		r.setSeed(123); // seed 고정
		System.out.println(r.nextInt()); // 랜덤 int
		System.out.println(r.nextInt(10)+1); // 랜덤 int 범위 지정 (0부터 입력한 숫자 전까지)
		System.out.println(r.nextBoolean()); // 랜덤 boolean
		System.out.println(r.nextDouble()); // 랜덤 double

	}

}
