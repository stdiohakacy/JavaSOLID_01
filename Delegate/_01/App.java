package Delegate._01;

class RealPrinter {
	void print() {
		System.out.println("The delegate");
	}
}

class Printer{
	RealPrinter real = new RealPrinter();
	
	void print() {
		real.print();
	}
}

public class App{
	public static void main(String[] args) {
		Printer p = new Printer();
		p.print();
	}
}