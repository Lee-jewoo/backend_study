package exam04_4;

public class Cat {
	
	String name;
	int age;
	String sex;
	
	public Cat() {}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}
	
	public void setCat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setCat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getCat(String name, int age, String sex) {
		return name+" "+age+" "+sex;
	}
	
	// return을 만나면 메서드를 빠져 나감
	public void xxx() {
		System.out.println("xxx1");
		if(true) return;
		System.out.println("xxx2");
	}
	
	// 자동 형변환이 되기 때문에 인자값이 int여도 long, float, double로 받을 수 있음
	public void yyy(double n) {
		this.xxx(); // 같은 클래스의 다른 메서드 호출
	}
	
}
