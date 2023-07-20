package shape;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape[] = {new Triangle(7, 5, "Blue"), 
					  	 new Rectangle(4, 6, "Blue"), 
					 	 new Triangle(6, 7, "Red"), 
						 new Rectangle(8, 3, "Red"), 
						 new Triangle(9, 8, "White"), 
						 new Rectangle(5, 7, "White")};
		
		System.out.println("기본정보");
		for (Shape s : shape) {
			System.out.printf("%.1f \t  %s\n", s.getArea(), s.getColors());
		}
		
		System.out.println("사이즈를 변경 후 정보");
		for (Shape s : shape) {
			s.setResize(5);
			System.out.printf("%.1f \t  %s\n", s.getArea(), s.getColors());
		}
		

	}

}
