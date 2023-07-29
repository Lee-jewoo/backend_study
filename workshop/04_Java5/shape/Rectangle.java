package workshop07.shape;

public class Rectangle extends Shape implements Movable {
	
	private int width;

	public Rectangle() {}

	public Rectangle(int width, int x, int y) {
		super(new Point(x, y));
		this.width = width;
	}

	@Override
	public void move(int x, int y) {
        point.setX(point.getX() + x + 2);
        point.setY(point.getY() + y + 2);
	}

	@Override
	public double getArea() {
		return (int)(width*width);
	}

	@Override
	public double getCircumference() {
		return (int)(width*4);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
