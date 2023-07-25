package exam10_2;

import java.util.Date;

class Box {
	Object obj;
	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return obj;
	}
}

public class GenericsTest {

	public static void main(String[] args) {
		// 문자열 박스
		Box b1 = new Box();
		b1.setValue("춘식이");
//		b1.setValue(10); 다른 데이터를 저장할 수 있음 -> 실행할 때 발견
		String str = (String)b1.getValue(); // 형변환을 꼭 해야 함
		System.out.println("문자열의 길이 : " + str.length());
		
		// 날짜 박스
		Box b2 = new Box();
		b2.setValue(new Date());
//		b2.setValue(10);
		Date d = (Date)b2.getValue();
		System.out.println("날짜 : " + d.getYear());
		
	}

}
