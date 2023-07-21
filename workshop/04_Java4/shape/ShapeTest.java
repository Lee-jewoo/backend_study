package shape;

public class ShapeTest2 {

	public static void main(String[] args) {
		
		Shape shape[] = {new Triangle(7, 5, "Blue"), 
					  	 new Rectangle(4, 6, "Blue"), 
					 	 new Triangle(6, 7, "Red"), 
						 new Rectangle(8, 3, "Red"), 
						 new Triangle(9, 8, "White"), 
						 new Rectangle(5, 7, "White")};
		
		System.out.println("기본정보");
		for (int i=0; i<shape.length; i++) {
			if (shape[i] instanceof Triangle) {
				System.out.printf("%s \t %.1f \t  %s\n", "Triangle", shape[i].getArea(), shape[i].getColors());
			} else if (shape[i] instanceof Rectangle){
				System.out.printf("%s \t %.1f \t  %s\n", "Rectangle", shape[i].getArea(), shape[i].getColors());
			}
		}
		System.out.println();
		System.out.println("사이즈 변경 후 정보");
		for (int i=0; i<shape.length; i++) {
			if (shape[i] instanceof Triangle) {
				((Triangle)shape[i]).setResize(5);
				System.out.printf("%s \t %.1f \t  %s\n", "Triangle", shape[i].getArea(), shape[i].getColors());
			} else if (shape[i] instanceof Rectangle){
				((Rectangle)shape[i]).setResize(5);
				System.out.printf("%s \t %.1f \t  %s\n", "Rectangle", shape[i].getArea(), shape[i].getColors());
			}
		}
				
	}

}
