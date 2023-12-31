package exam07_3;

public class Bird extends Pet {
	
	String color;
	
	@Override
	public String toString() {
		return String.format("Bird 이름 : %s \t Bird 나이 : %d \t Bird 색깔 : %s", name, age, color);
	}

	public void fiy() {
		System.out.println("Bird.fly");
	}

	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}

	public Bird() {}

	public Bird(String name, int age) {
		super(name, age);
	}

	public Bird(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
