package exam04;

public class TestPet {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		// 멤버에 접근해 인스턴스 변수 초기화
		c.name = "나비";
		c.age = 10;
		c.sex = "수컷";
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
		
		Cat c2 = new Cat();
		c2.name = "미미";
		c2.age = 5;
		c2.sex = "암컷";
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.sex);
		
		
	}

}
