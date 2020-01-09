package SOLID.Liskov._02;

public abstract class Shape {
	protected int height;
	protected int width;

	public abstract int getHeight();

	public abstract void setHeight(int height);

	public abstract int getWidth();

	public abstract void setWidth(int width);

	public int getArea() {
		return height * width;
	}
}

class Rectangle extends Shape {

	@Override
	public int getHeight() {
		return width;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

}

class Square extends Shape {
	private void setWidthAndHeight(int edge) {
		this.height = edge;
		this.width = edge;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public void setHeight(int height) {
		setWidthAndHeight(height);
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public void setWidth(int width) {
		setWidthAndHeight(width);
	}

}