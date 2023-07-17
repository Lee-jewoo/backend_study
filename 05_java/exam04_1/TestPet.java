package exam04_1;

public class TestPet {

	public static void main(String[] args) {
		Cat c = new Cat ("나비", 10, "수컷");
		System.out.println(c.name); // 나비
		System.out.println(c.age); // 10
		System.out.println(c.sex); // 수컷
	}

}
