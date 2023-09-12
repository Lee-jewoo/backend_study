
public class Algo05_selection_sort {
	
	// 교환 메서드
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
		}
	
	// 정렬할 데이터 메서드
	public static void selection_sort(int [] arr, int size) {
		for (int i=0; i<size-1; i++) {
			int minIdx = i;
			for (int j=i+1; j<size; j++) { // 최소값 찾기
				if (arr[j]<arr[minIdx]) {
					minIdx = j;
				}
			}
			swap(arr, i, minIdx);
		}
	}
	
	static int [] arr = {7, 3, 2, 8, 9, 4, 6, 1, 5}; // 정렬할 데이터 저장
	public static void main(String[] args) {
		
		// 선택 정렬
		int size = arr.length;
		selection_sort(arr, size);
		for (int n : arr) {
			System.out.print(n+" ");
		}
	}

}
