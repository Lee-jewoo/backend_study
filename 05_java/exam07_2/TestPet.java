package exam07_2;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("나비", 10);
		Dog d = new Dog("꾸기", 11, "수컷");
		Bird b = new Bird("앵무", 5, "빨강");
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(b);

	}

}
