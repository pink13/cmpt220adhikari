package Problem13_07;
public class Square extends GeometricObject implements Colorable {
	private double side;

	public Square() {
	}

	public Square(double side) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}

	//sets side
	public void setSide(double side) {
		this.side = side;
	}

	//returns side
	public double getSide() {
		return side;
	}

	//returns area
	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	//returns perimeter
	@Override
	public double getPerimeter() {
		return side * 4;
	}

	//returns how to color the object
	@Override
	public String howToColor() {
		return "Color all four sides";
	}

	//returnss the string format
	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}
}