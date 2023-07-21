package exam08;

interface Flyer{
	public abstract void fly();
}

class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("Bird.fly");
	}
}

public class TestMain {

	public static void main(String[] args) {
		
		// 이름 있는 클래스를 사용
		Flyer f = new Bird();
		f.fly();
		
		// 익명클래스 사용
		Flyer f2 = new Flyer() {
			public void fly() {
				System.out.println("익명클래스");
			}
		};
		f2.fly();

	}

}
