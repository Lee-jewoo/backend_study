package exam04_5;
// 하나의 클래스에서 여러 개의 클래스 정의 (실무에서는 절대 사용 금지)
class Cat {
	String name;
	int age;
	String sex;
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}

public class TestPet {
	
	public static void pdt(int x) {
		x = 20;
	}
	
	public static void rdt(Cat x) {
		x.setAge(5);
	}

	public static void main(String[] args) {
		
		// 기본형 데이터는 값이 변경되지 않음
		int n = 10;
		System.out.println("호출 전 : "+n); // 10
		pdt(n);
		System.out.println("호출 후 : "+n); // 10
		
		// 참조형 데이터는 값이 변경됨
		Cat c = new Cat("나비", 10, "수컷");
		System.out.println("호출 전 : "+ c.getAge()); // 10
		rdt(c);
		System.out.println("호출 후 : "+ c.getAge()); // 5

	}

}
