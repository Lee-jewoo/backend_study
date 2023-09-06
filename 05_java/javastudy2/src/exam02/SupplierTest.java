package exam02;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		// 익명클래스
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "춘식이";
			}
		};
		System.out.println("Supplier : " + s.get());
		
		// 람다 표현식
		Supplier<String> s2 = () -> "춘식이";
		System.out.println("람다 Supplier : " + s2.get());
		
		// 익명클래스
		int num = 10;
		BooleanSupplier b = new BooleanSupplier() {
			@Override
			public boolean getAsBoolean() {
				return num%2==0;
			}
		};
		System.out.println("BooleanSupplier : " + b.getAsBoolean());
		
		// 람다 표현식
		BooleanSupplier b2 = () -> num%2==0;
		System.out.println("람다 BooleanSupplier : " + b2.getAsBoolean());
		
		// 익명클래스
		String name = "춘식이";
		IntSupplier y = new IntSupplier() {
			@Override
			public int getAsInt() {
				return name.length();
			}
		};
		System.out.println("name 길이 : " + y.getAsInt());
		
		// 람다 표현식
		IntSupplier y2 = () -> name.length();
		System.out.println("람다 name 길이 : " + y2.getAsInt());
		
	}

}
