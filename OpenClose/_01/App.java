package OpenClose._01;

interface Shape {
	public double calcArea();
}

class Rectangle implements Shape {
	public double length;
	public double width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calcArea() {
		return this.length * this.width;
	}
}

class Circle implements Shape {
	public double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return (22 / 7) * radius * radius;
	}

}

public class App {
	public static void main(String[] args) {
		Shape shape;
		shape = new Rectangle(1, 2);
		System.out.println(shape.calcArea());
		shape = new Circle(10);
		System.out.println(shape.calcArea());
	}
}
