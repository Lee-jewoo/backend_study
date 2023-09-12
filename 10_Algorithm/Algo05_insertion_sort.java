
public class Algo05_insertion_sort {
	
	// 교환 메서드
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
		}
	
	// 정렬할 데이터 메서드
	public static void insertion_sort(int [] arr, int size) {
		for (int i=1; i<size; i++) {
			for (int j=i; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j-1, j);
				}
			}
		}
	}
	
	static int [] arr = {7, 3, 2, 8, 9, 4, 6, 1, 5}; // 정렬할 데이터 저장
	public static void main(String[] args) {
		
		// 삽입 정렬
		int size = arr.length;
		insertion_sort(arr, size);
		for (int n : arr) {
			System.out.print(n+" ");
		}
	}

}
