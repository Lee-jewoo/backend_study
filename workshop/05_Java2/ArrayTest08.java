package Test02;

public class ArrayTest08 {
	
	public static void main(String[] args) {
		int [] score= {99,34,67,22,11,9};
		int max = 0;
		int min = score[0];
		for (int i=0; i<score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		for (int i=0; i<score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
