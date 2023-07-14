package exam03;

public class Java03_1_ArrayTest1_2D_4 {

	public static void main(String[] args) {
		// 2차원 배열 new와 리터럴 이용
		int [][] n = new int [][] {{1}, {2, 3}, {4, 5, 6}};
		System.out.println(n[0][0]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);
		System.out.println(n[2][0]);
		System.out.println(n[2][1]);
		System.out.println(n[2][2]);
		System.out.println(n.length);
		System.out.println(n[0].length);
		System.out.println(n[1].length);
		System.out.println(n[2].length);
	}

}
