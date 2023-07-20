package exam07_3;

public class Dog extends Pet{
	
	String sex;
	
	@Override
	public String toString() {
		return String.format("Dog 이름 : %s \t Dog 나이 : %d \t Dog 성별 : %s", name, age, sex);
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Dog.sleep");
	}

	public Dog() {}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
