package exam03;

public class Java03_1_ArrayTest1_2D_2 {

	public static void main(String[] args) {
		// 2차원 배열 new 이용
		int [][] n = new int [3][];
		n[0] = new int[1];
		n[1] = new int[2];
		n[2] = new int[3];
		n[0][0] = 1;
		n[1][0] = 2;
		n[1][1] = 3;
		n[2][0] = 4;
		n[2][1] = 5;
		n[2][2] = 6;
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
