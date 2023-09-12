import java.util.Stack;

public class Algo04_nonlinear_graph_AdjacencyMatrix_DFS {
	
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
		
		// Graph 탐색 (DFS)
		// 1~8노드의 이웃 지정
		int [][] graph = {{},
						  {3, 2}, // {2, 3}
						  {5, 4}, // {4, 5}
						  {6},
						  {7},
						  {},
						  {8},
						  {},
						  {}};
		StringBuilder sb = new StringBuilder(); // 방문 순서 저장
		Stack<Integer> stack = new Stack<Integer>();
		boolean [] visited = new boolean[9]; // 방문 여부 확인
		
		stack.push(1); // 시작 정점 저장
		visited[1] = true; // 정점 방문
		while(!stack.isEmpty()) {
			int idx = stack.pop();
			sb.append(idx+" -> ");
			for (int linkedNode : graph[idx]) {
				if (!visited[linkedNode]) {
					stack.push(linkedNode);
					visited[linkedNode] = true;
				}
			}
		}
		System.out.println("DFS 순회 : "+sb.toString());
		// 1 -> 3 -> 6 -> 8 -> 2 -> 5 -> 4 -> 7
		// 1 -> 2 -> 4 -> 7 -> 5 -> 3 -> 6 -> 8
	}

}
