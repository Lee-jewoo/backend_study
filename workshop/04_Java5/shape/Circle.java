package workshop07.shape;

public class Circle extends Shape implements Movable {
	
	private int radius;
	
	public Circle() {}

    public Circle(int radius, int x, int y) {
        super(new Point(x, y));
        this.radius = radius;
    }

	@Override
	public void move(int x, int y) {
		point.setX(point.getX() + x + 1);
		point.setY(point.getY() + y + 1);
	}

	@Override
	public double getArea() {
		return (int)(radius*radius*3.14);
	}

	@Override
	public double getCircumference() {
		return (int)(2*radius*3.14);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
