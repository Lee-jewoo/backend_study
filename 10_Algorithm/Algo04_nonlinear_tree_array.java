import java.util.Scanner;

public class Algo04_nonlinear_tree_array {
	
	static int n; // 노드 개수
	
	static int [][] tree; // 노드를 저장하는 2차원 배열
	
	// 순회 메서드 -> 재귀함수 이용
	private static void order(int x) {
		// 자식 여부 확인
		if (tree[x][0]==-1 && tree[x][1]==-1) {
			System.out.print(x+" ");
		} else { // 자식이 있을 때
//			System.out.print(x+" "); // 전위 순회 0 1 3 4 2 5 
			if (tree[x][0]!=-1) { // 왼쪽 자식이 있을 때
				order(tree[x][0]);
			}
//			System.out.print(x+" "); // 중위 순회 3 1 4 0 2 5 
			if (tree[x][1]!=-1) { // 오른쪽 자식이 있을 때
				order(tree[x][1]);
			}
			System.out.print(x+" "); // 후위 순회 3 4 1 5 2 0 
		}
	}

	public static void main(String[] args) {
		
		// Tree 생성 (배열)
		Scanner sc = new Scanner(System.in);
		System.out.println("노드 개수 : ");
		n = sc.nextInt();
		
		tree = new int [n][2];
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int l_child = sc.nextInt();
			int r_child = sc.nextInt();
			tree[x][0] = l_child;
			tree[x][1] = r_child;
		}
/*
6
0 1 2
1 3 4
2 -1 5
3 -1 -1
4 -1 -1
5 -1 -1
*/
		
		for (int i=0; i<tree.length; i++) {
			for (int j=0; j<tree[i].length; j++) {
				System.out.println(i+"의 자식 "+tree[i][j]);
			}
		}
		
		// 순회
		order(0);
		
	}

}
