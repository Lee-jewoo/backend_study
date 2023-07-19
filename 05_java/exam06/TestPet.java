package exam06;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c1 = new Cat("나비", 10);
		
		Dog d1 = new Dog("떡꾸기", 10, "수컷");
		
		Bird b1 = new Bird("앵무", 5, "빨강");
		
		System.out.printf("Cat 이름 : %s \t Cat 나이 : %d \n", c1.getName(), c1.getAge());
		System.out.printf("Dog 이름 : %s \t Dog 나이 : %d \t Dog 성별 : %s \n", d1.getName(), d1.getAge(), d1.getSex());
		System.out.printf("Bird 이름 : %s \t Bird 나이 : %d \t Bird 색깔 : %s \n", b1.getName(), b1.getAge(), b1.getColor());

		c1.eat();
		c1.sleep();
		c1.jump();
		d1.eat();
		d1.sleep();
		b1.eat();
		b1.sleep();
		b1.fly();
	}

}
