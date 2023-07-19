package exam06_5;

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

	public Cat() {}

	public Cat(String name, int age) {
		super(name, age); // 반드시 첫 줄에 부모가 초기화
	}

	
	
}
