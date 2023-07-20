package exam07;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("나비", 10);
		Dog d = new Dog("꾸기", 11, "수컷");
		Bird b = new Bird("앵무", 5, "빨강");
		
		System.out.printf("Cat 이름 : %s \t Cat 나이 : %d \n", c.getName(), c.getAge());
		System.out.printf("Dog 이름 : %s \t Dog 나이 : %d \t Dog 성별 : %s \n", d.getName(), d.getAge(), d.getSex());
		System.out.printf("Bird 이름 : %s \t Bird 나이 : %d \t Bird 색깔 : %s \n", b.getName(), b.getAge(), b.getColor());
		
		Pet p = new Cat("나비", 10);
		System.out.printf("Cat 이름 : %s \t Cat 나이 : %d \n", p.getName(), p.getAge());
		p = new Dog("꾸기", 11, "수컷");
		System.out.printf("Dog 이름 : %s \t Dog 나이 : %d \n", p.getName(), p.getAge());
		p = new Bird("앵무", 5, "빨강");
		System.out.printf("Bird 이름 : %s \t Bird 나이 : %d \n", p.getName(), p.getAge());
	}

}
