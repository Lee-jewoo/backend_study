package Test02;

public class ArrayTest03 {
	
	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		double total = 0;
		double average = 0;
		double total_arr2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				total += arr2[i][j];
			}
			total_arr2 += arr2[i].length;
			average = total / total_arr2;
		}
		System.out.println("total="+(int)total);
		System.out.println("average="+average);
	}

}
