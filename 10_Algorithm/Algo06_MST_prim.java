import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Algo06_MST_prim {
	
	static  class Node{
		int to;
		int weight;
		public Node(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
		public int getWeight() {
			return weight;
		}
		@Override
		public String toString() {
			return "Node [to=" + to + ", weight=" + weight + "]";
		}
	}
	static int cnt = 7; // 정점 개수
	static int total; // 가중치의 합
	static ArrayList<ArrayList<Node>> nodeList = new ArrayList<ArrayList<Node>>(); // grape 값 지정
	static boolean [] visited = new boolean [cnt+1]; // 방문 여부 확인
	static StringBuilder sb = new StringBuilder(); // 정점 순서 저장
	
	// prim 알고리즘 구현
	private static void prim(int start) {
		// 가장 작은 가중치를 가진 node 얻기
		Queue<Node> q = new PriorityQueue<>(Comparator.comparing(Node::getWeight));
		
		// 시작값 저장
		q.add(new Node(start, 0));
		while(!q.isEmpty()) {
			Node p = q.poll();
			int to = p.to;
			int weight = p.weight;
			// 정점에 방문한 적이 있을 때
			if (visited[to]) continue;
			// 정점에 방문한 적이 없을 때
			visited[to] = true;
			sb.append(to+" -> ");
			total += weight; // 가중치값 누적
			
			// 방문한 적이 없는 이웃 노드를 Queue에 추가
			for (Node next : nodeList.get(to)) {
				if (!visited[next.to]) {
					q.add(next);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		// 최소 신장 트리 (MST) -> Prim 알고리즘
		// 가중치 그래프
		int [][] graph = {{1, 2, 29}, 
						  {1, 5, 75},
						  {2, 3, 35},
						  {2, 6, 34},
						  {3, 4, 7},
						  {4, 6, 23},
						  {4, 7, 13},
						  {5, 6, 53},
						  {6, 7, 25}};
		
		// 중첩 ArrayList 생성
		for (int i=0; i<=cnt; i++) {
			nodeList.add(new ArrayList<Node>());
		}
		
		// nodeList에 graph 저장
		for (int i=0; i<graph.length; i++) {
			int v1 = graph[i][0];
			int v2 = graph[i][1];
			int weight = graph[i][2];
			
			nodeList.get(v1).add(new Node(v2, weight));
			nodeList.get(v2).add(new Node(v1, weight));
		}
		
		prim(1);
		System.out.println("탐색 순서 : "+sb.toString());
		System.out.println("MST의 총 가중치 : "+total);
		
	}

}
