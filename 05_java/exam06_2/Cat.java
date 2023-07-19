package exam06_2;

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
		System.out.println("Cat 생성자");
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
