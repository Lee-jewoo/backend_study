
public class Algo05_merge_sort {

	// 분할 (devide)
	public static void merge_sort(int [] arr, int left, int right) {
		if (left==right) return; // 개수가 1일 때 더 이상 분할 불가
		int mid = (left + right)/2;
		merge_sort(arr, left, mid);
		merge_sort(arr, mid+1, right);
		
		// 병합 (conquer)
		merge(arr, left, mid, right);
	}
	
	// 병합 (conquer)
	static int [] sorted = null; // 병합에 필요한 임시 배열
	public static void merge(int [] arr, int left, int mid, int right) {
		sorted = new int [arr.length];
		int l = left; // 왼쪽 부분배열의 시작점
		int r = mid+1; // 오른쪽 부분배열의 시작점
		int idx = left; // sorted 배열에 저장하기 위한 인덱스
		
		while (l<=mid && r <= right) {
			// 왼쪽과 오른쪽을 비교해 작은 값을 sorted에 저장
			if (arr[l]<=arr[r]) {
				sorted[idx]=arr[l];
				idx++;
				l++;
			} else {
				sorted[idx]=arr[r];
				idx++;
				r++;
			}
		}
		
		if (l>mid) { // 오른쪽 배열이 남아 있는 경우
			while (r<=right) {
				sorted[idx]=arr[r];
				idx++;
				r++;
			}
		} else { // 왼쪽 배열이 남아 있는 경우
			while (l<=mid) {
				sorted[idx]=arr[l];
				idx++;
				l++;
			}
		}
		
		// sorted의 값을 원본 배열에 복사
		for (int i=left; i<=right; i++) {
			arr[i]=sorted[i];
		}
		
	}
	
	static int [] arr = {8, 2, 6, 4, 7, 3, 9, 5}; // 정렬할 데이터 저장
	public static void main(String[] args) {
		
		// 병합 정렬
		merge_sort(arr, 0, arr.length-1);
		for (int n : arr) {
			System.out.print(n+" ");
		}
	}

}
