package exam07_1;

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
		super();
		System.out.println("Cat 생성자");
	}

	public Cat(String name, int age) {
		super(name, age);
		System.out.println("Cat2 생성자");
	}

	@Override // toString을 재정의
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
