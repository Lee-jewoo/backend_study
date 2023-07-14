package exam02;

public class Java01_3_TypeCastTset {

	public static void main(String[] args) {
		// 묵시적 형변환 (upcasting)
		
		byte n = 10;
		short n2 = n;
		int n3 = n2;
		long n4 = n3;
		float m = n4;
		double m2 = m;
		
		 // 아스키코드 -> 문자의 연산이 가능
		char s = 'A';
		char s2= 'a';
		int c = s;
		int c2 = s2;
		System.out.println(c + " " + c2); // 65 97
		
		short a = 10;
		short a2 = 10;
		int a3 = a + a2 ; // short로 지정하면 error
		
		float f = 3.14f;
		int i = 10;
		System.out.println(f+i);
				
	}

}
