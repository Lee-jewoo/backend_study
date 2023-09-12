import java.util.Scanner;

	//노드를 저장하는 클래스
	class Node {
		int data; // 노드값
		Node left; // 왼쪽 자식 노드 참조값
		Node right; // 오른쪽 자식 노드 참조값
		
		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
		
	}

public class Algo04_nonlinear_tree_linkedList {
	
	// 노드를 생성하는 메서드
	private static Node root;
	public static void createNode(int data, int leftData, int rightData) {
		// 초기 상태 여부 확인
		if (root == null) {
			root = new Node(data);
			if (leftData != -1) {
				root.left = new Node(leftData);
			}
			if (rightData != -1) {
				root.right = new Node(rightData);
			}
		} else {
			// 특정 노드를 찾아 자식 노드 생성
			searchNode(root, data, leftData, rightData);
		}
	}
	
	// 특정 노드를 찾는 메서드
	public static void searchNode(Node node, int data, int leftData, int rightData) {
		if (node==null) {
			return;
		} else if (node.data == data) {
			if (leftData != -1) {
				node.left = new Node(leftData);
			}
			if (rightData != -1) {
				node.right = new Node(rightData);
			}
		} else {
			// 왼쪽 탐색
			searchNode(node.left, data, leftData, rightData);
			// 오른쪽 탐색
			searchNode(node.right, data, leftData, rightData);
		}
	}
	
	// 트리 순회 메서드
	public static void order(Node node) {
		if (node != null) {
//			System.out.print(node.data+" "); // 전위 순회 0 1 3 4 2 5 
			if (node.left != null) {
				order(node.left);
			}
//			System.out.print(node.data+" "); // 중위 순회 3 1 4 0 2 5 
			if (node.right != null) {
				order(node.right);
			}
			System.out.print(node.data+" "); // 후위 순회 3 4 1 5 2 0 
		}
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
	public static void main(String[] args) {
		
		// Tree 생성 (연결리스트)
		Scanner sc = new Scanner(System.in);
		System.out.println("노드 개수 : ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int l_child = sc.nextInt();
			int r_child = sc.nextInt();
			createNode(x, l_child, r_child);
		}
		
		System.out.println(root);
		
		// 순회
		order(root);
		
	}

}
