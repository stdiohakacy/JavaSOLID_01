package SOLID.Liskov._01;

public class Square extends Rectangle {

	public Square() {}

	public int getEdge() {
		return this.height;
	}

	public void setEdge(int edge) {
		this.height = this.width = edge;
	}

}
