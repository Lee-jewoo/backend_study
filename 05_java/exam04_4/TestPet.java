package exam04_4;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("나비", 10, "수컷");
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		
		c.setCat("미미", 5, "암컷");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		
		c.setCat("코코", 3);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		String result = c.getCat("나비", 10, "수컷");
		System.out.println(result);
		
		c.xxx();
		
		c.yyy(10);

	}

}
