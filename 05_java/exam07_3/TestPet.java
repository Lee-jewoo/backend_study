package exam07_3;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("나비", 10);
		Dog d = new Dog("꾸기", 11, "수컷");
		Bird b = new Bird("앵무", 5, "빨강");
//		Pet p = new Pet(); 추상클래스는 객체를 생성할 수 없음
		Pet p = new Cat(); // 다형성을 적용할 수 있음
		
		c.eat();
		c.sleep();
		d.eat();
		d.sleep();
		b.eat();
		b.sleep();

	}

}
