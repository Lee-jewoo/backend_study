package workshop07.shape;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Rectangle(4, 7, 5));
		list.add(new Rectangle(5, 4, 6));
		list.add(new Circle(6, 6, 7));
		list.add(new Circle(7, 8, 3));
		
		System.out.println("구분 \t\t 길이 \t X좌표 \t Y좌표 \t Area \t Circumference");
		for (Shape shape : list) {
			if (shape instanceof Rectangle) {
				System.out.println("Rectangle \t "+((Rectangle) shape).getWidth()+" \t "+shape.getPoint().getX()+" \t "+shape.getPoint().getY()+" \t "+shape.getArea()+" \t "+shape.getCircumference());
			} else if (shape instanceof Circle) {
				System.out.println("Circle \t\t "+((Circle) shape).getRadius()+" \t "+shape.getPoint().getX()+" \t "+shape.getPoint().getY()+" \t "+shape.getArea()+" \t "+shape.getCircumference());
			}
		}
		
		System.out.println("이동 후...");
		for (Shape shape : list) {
			if (shape instanceof Rectangle) {
				((Rectangle) shape).move(10, 10);
				System.out.println("Rectangle \t "+((Rectangle) shape).getWidth()+" \t "+shape.getPoint().getX()+" \t "+shape.getPoint().getY());
			} else if (shape instanceof Circle) {
				((Circle) shape).move(10, 10);
				System.out.println("Circle \t\t "+((Circle) shape).getRadius()+" \t "+shape.getPoint().getX()+" \t "+shape.getPoint().getY());
			}
		}

	}

}
