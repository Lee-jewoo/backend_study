package exam06_5;

public class Dog extends Pet{

	String sex;
	
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}

	public Dog() {}
	
	public Dog(String name, int age, String sex) {
		super(name, age); // 반드시 첫 줄에 부모가 초기화
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
