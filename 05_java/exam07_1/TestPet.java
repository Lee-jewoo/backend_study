package exam07_1;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("나비", 10);
		System.out.println(c); // toString이 자동으로 호출
		System.out.println(c.toString());		
	}

}
