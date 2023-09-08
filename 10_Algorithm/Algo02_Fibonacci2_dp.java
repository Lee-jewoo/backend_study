
public class Algo02_Fibonacci2_dp {
	static int num = 0;
	private static int fibonacci2(int n) {
		num++;
		if (n<=1) {
			return n;
		} else {
			return fibonacci2(n-1)+fibonacci2(n-2);
		}
	}
	
	// Dynamic Programming
	static int [] dp;
	private static int fibonacci(int n) {
		num++;
		if (n<=1) {
			return n;
		} else {
			if (dp[n] != 0) return dp[n];
			dp[n] = fibonacci(n-1)+fibonacci(n-2);
			return dp[n];
		}
	}

	public static void main(String[] args) {
		int n = 10;
		dp = new int [n+1];
		for (int i=1; i<=n; i++) {
			System.out.print(fibonacci(i)+" ");		
		}
		System.out.println("호출 횟수 : " + num);

	}

}
