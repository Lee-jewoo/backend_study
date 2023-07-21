package exam08_1;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// 구분자 1개
		String s = "aaa/bbb/ccc";
		StringTokenizer st = new StringTokenizer(s, "/");
		System.out.println(st.countTokens()); // 토큰의 개수
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// 구분자 여러 개
		String s2 = "a/bb,ccc;d";
		StringTokenizer st2 = new StringTokenizer(s2, "/,;");
		System.out.println(st2.countTokens()); // 토큰의 개수
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}

}
