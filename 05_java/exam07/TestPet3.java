package exam07;

public class TestPet3 {
	
	public static void a(Pet p) {
		
	}
	public static void b(Object o) {
		
	}

	public static void main(String[] args) {
		
		Cat c = new Cat("나비", 10);
		Dog d = new Dog("꾸기", 11, "수컷");
		Bird b = new Bird("앵무", 5, "빨강");
		
		// Pet 클래스
		a(c);
		a(d);
		a(b);
		
		// Object 클래스
		b(10);
		b(3.14);
		b(true);
		b(c);
		b("hello");
		
	}

}
