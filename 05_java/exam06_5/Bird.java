package exam06_5;

public class Bird extends Pet{
	
	String color;
	
	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}

	public void fly(){
		System.out.println("Bird.fly");
	}
	
	public Bird() {}
	public Bird(String name, int age, String color) {
		super(name, age); // 반드시 첫 줄에 부모가 초기화
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
