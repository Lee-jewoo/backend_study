package exam06_4;

public class Cat extends Pet{
	
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public void jump(){
		System.out.println("Cat.jump");
	}

	public Cat() {
		super(); // 자동으로 삽입 -> 사용한다면 반드시 첫 줄에서 작성
		System.out.println("Cat 생성자");
	}

	public Cat(String name, int age) {
		super(name, age); // 부모에서 선언된 변수를 부모가 초기화
		System.out.println("Cat2 생성자");
//		부모에서 선언된 변수를 자식이 초기화
//		this.name = name;
//		this.age = age;
	}
	
}
