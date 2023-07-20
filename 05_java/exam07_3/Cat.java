package exam07_3;

public class Cat extends Pet {
	
	@Override
	public String toString() {
		return String.format("Cat 이름 : %s \t Cat 나이 : %d", name, age);
	}

	public void jump() {
		System.out.println("Cat.jump");
	}

	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {}

	public Cat(String name, int age) {
		super(name, age);
	}
	
}
