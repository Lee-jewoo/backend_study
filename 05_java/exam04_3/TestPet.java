package exam04_3;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("나비", 10, "수컷");
		
		// 인스턴스 변수에 직접 접근
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
		
		// method를 이용해 접근
		String name = c.getName();
		System.out.println(name);
		
		int age = c.getAge();
		System.out.println(age);
		
		String sex = c.getSex();
		System.out.println(sex);
		
		// 인스턴스 변수에 직접 접근해 수정
		c.age = 3;
		System.out.println(c.getAge());
		
		// setter를 이용해 수정
		c.setName("미미");
		System.out.println(c.getName());
	}

}
