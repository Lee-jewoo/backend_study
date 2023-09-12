import java.util.Scanner;

public class Algo04_nonlinear_tree_BST {
	//노드를 저장하는 클래스
	static class Node {
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
10
35 18 68
18 7 26
68 -1 99
7 3 12
26 22 30
99 -1 -1
3 -1 -1
12 -1 -1
22 -1 -1
30 -1 -1
*/
	static int num = 0;
	private static Node bstSearch (Node node, int key) {
		num++;
		if (node == null) {
			return null;
		}
		if (node.data == key) {
			return node;
		} else if (node.data < key) {
			return bstSearch(node.right, key);
		} else {
			return bstSearch(node.left, key);			
		}
	}
	
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
		
		// BST 검색
		Node searchNode = bstSearch(root, 30);
		if (searchNode != null) {
			System.out.println("탐색 성공" + num+"회");
		} else {
			System.out.println("탐색 실패");
		}
		
	}

}
