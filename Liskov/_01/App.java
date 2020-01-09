package SOLID.Liskov._01;

public class App {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.setHeight(10);
		rec.setWidth(20);
		System.out.println(rec.getArea());
		
		Square square = new Square();
		square.setEdge(10);
		System.out.println(square.getArea());
		//work
		
		rec = square; // vi pham Liskov
		System.out.println(rec.getArea());
	}
}
