package exam06_1;

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
		this.name = name;
		this.age = age;
	}
	
}
