package shape;

public class Rectangle extends Shape implements Resize {

	public Rectangle() {}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);
	}

	@Override
	public double getArea() {
		double area = getWidth()*getHeight();
		return area;
	}

}
