import java.util.LinkedList;
import java.util.Queue;

public class Algo04_nonlinear_graph_AdjacencyMatrix_BFS {
	
/* 인접 행렬
  1 2 3 4 5 6 7 8
1 0 1 1 0 0 0 0 0
2 1 0 0 1 1 0 0 0
3 1 0 0 0 0 1 0 0
4 0 1 0 0 0 0 1 0
5 0 1 0 0 0 0 0 0
6 0 0 1 0 0 0 0 1
7 0 0 0 1 0 0 0 0
8 0 0 0 0 0 1 0 0
*/
	public static void main(String[] args) {
		
		// Graph 탐색 (BFS)
		// 1~8노드의 이웃 지정
		int [][] graph = {{},
						  {2, 3}, // {3, 2}
						  {4, 5}, // {5, 4}
						  {6},
						  {7},
						  {},
						  {8},
						  {},
						  {}};
		StringBuilder sb = new StringBuilder(); // 방문 순서 저장
		Queue<Integer> queue = new LinkedList<>();
		boolean [] visited = new boolean[9]; // 방문 여부 확인
		
		queue.offer(1); // 시작 정점 저장
		visited[1] = true; // 정점 방문
		while(!queue.isEmpty()) {
			int idx = queue.poll();
			sb.append(idx+" -> ");
			for (int linkedNode : graph[idx]) {
				if (!visited[linkedNode]) {
					queue.offer(linkedNode);
					visited[linkedNode] = true;
				}
			}
		}
		System.out.println("BFS 순회 : "+sb.toString());
		// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
	}

}
