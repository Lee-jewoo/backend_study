package exam05_1;

public class Cat {
	
	// 인스턴스 변수의 접근은 private으로 지정을 권장 -> Cat 클래스의 데이터 보호
	private String name;
	protected int age;
	public String sex;
	
	// class, 생성자, method는 public 권장
	public Cat() {}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
		info();
	}
	
	private void info() {
		System.out.println("info");
	}

}
