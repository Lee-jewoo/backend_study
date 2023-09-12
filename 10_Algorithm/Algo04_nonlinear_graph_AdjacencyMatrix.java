import java.util.Scanner;

public class Algo04_nonlinear_graph_AdjacencyMatrix {
	
/*
  1 2 3 4 5
1 0 1 1 0 0
2 1 0 0 0 1
3 1 0 0 1 0
4 0 0 1 0 1
5 0 1 0 1 0

입력
정점 개수 / 간선 개수 -> 5 5
연결된 정점 지정 ->
1 2
1 3
2 5
3 4
4 5
*/
	public static void main(String[] args) {
		
		// Graph 생성 (인접 행렬)
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정점 개수
		int m = sc.nextInt(); // 간선 개수
		
		int [][] adjArray = new int[n+1][n+1];
		
		for (int i=0; i<m; i++) { // 연결된 정점 지정
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjArray[v1][v2] = 1;
			adjArray[v2][v1] = 1;
		}
		
		// 인접 행렬 출력
		System.out.println("  1 2 3 4 5");
		for (int i=1; i<adjArray.length; i++) {
			System.out.print(i+" ");
			for (int j=1; j<adjArray[i].length; j++) {
				System.out.print(adjArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
