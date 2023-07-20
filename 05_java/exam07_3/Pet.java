package exam07_3;

public abstract class Pet {
	
	String name;
	int age;
	
	// 자식 클래스에서 해당 메서드를 필히 사용하도록 함
	public abstract void eat();
	public abstract void sleep();
	
	public Pet() {}
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
