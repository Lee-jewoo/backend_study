package exam07;

public class TestPet2 {

	public static void main(String[] args) {
		
		// 다형성을 활용해 데이터를 배열에 저장
		Pet [] pets = {new Cat("나비", 10), 
				       new Dog("꾸기", 11, "수컷"),
				       new Cat("미미", 5), 
				       new Cat("코코", 3), 
				       new Bird("앵무", 5, "빨강"), 
				       new Dog("로또", 5, "수컷")};
		
		for (Pet p : pets) {
			System.out.printf("이름 : %s \t 나이 : %d \n", p.getName(), p.getAge());
		}
		
		for (Pet p : pets) {
			if (p instanceof Cat) {
				System.out.printf("Cat 이름 : %s \t Cat 나이 : %d \n", p.getName(), p.getAge());
			}
		}
		for (Pet p : pets) {
			if (p instanceof Dog) {
				System.out.printf("Dog 이름 : %s \t Dog 나이 : %d \t Dog 성별 : %s \n", p.getName(), p.getAge(), ((Dog) p).getSex());
			}
		}
		
	}

}
