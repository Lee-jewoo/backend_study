package exam06_3;

class Parent {
	int age = 20;
}

class Child extends Parent{
	int age = 10;
	
	public void info() {
		System.out.println("자식 : "+age);
		System.out.println("부모 : "+super.age);
	}
}

public class TestMain {

	public static void main(String[] args) {
		Child c = new Child();
		c.info();
	}

}
