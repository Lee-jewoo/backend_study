package exam10_2;

import java.util.Date;

class Box2<T> {
	T obj;
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}

public class GenericsTest2 {

	public static void main(String[] args) {
		// 문자열 박스
		Box2<String> b1 = new Box2<String>();
		b1.setValue("춘식이");
//		b1.setValue(10); 타입이 다르기 때문에 에러 -> 컴파일할 때 에러를 파악할 수 있음
		String str = b1.getValue(); // 형변환이 필요하지 않음
		System.out.println("문자열의 길이 : " + str.length());
		
		// 날짜 박스
		Box2<Date> b2 = new Box2<Date>();
		b2.setValue(new Date());
//		b2.setValue(10);
		Date d = b2.getValue();
		System.out.println("날짜 : " + d.getYear());
		
	}

}
