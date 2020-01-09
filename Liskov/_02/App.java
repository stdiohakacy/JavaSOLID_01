package SOLID.Liskov._02;


public class App {
	public static void main(String[] args) {
		Shape shape = new Rectangle();
		shape.setHeight(10);
		shape.setWidth(20);
		
		System.out.println(shape.getArea());
		
		shape = new Square();
		shape.setHeight(10);
		shape.setWidth(20);
		
		System.out.println(shape.getArea());
	}
}
