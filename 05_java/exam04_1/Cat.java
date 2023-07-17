package exam04_1;

public class Cat {
	
	String name;
	int age;
	String sex;
	
	// 생성자를 이용해 인스턴스 변수 초기화
	public Cat() {}
	public Cat(String n) {}
	public Cat(int a) {}
	public Cat(String n, int a) {}
	public Cat(int a, String n) {}
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
}
