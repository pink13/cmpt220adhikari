package Problem13_01;

public class Triangle extends GeometricObject {
	private double side1; 
	private double side2; 
	private double side3;

	public Triangle(){
	} 

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, 
		String color, boolean filled) {
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled); 
	}

	/** Return side1 */
	public double getSide1() {
		return side1;
	}

	/** Set side1 to a new length */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/** Return side2 */
	public double getSide2() {
		return side2;
	}

	/** Set side2 to a new length */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/** Return side3 */
	public double getSide3() {
		return side3;
	}

	/** Set side3 to a new length */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override /** Return area of this Triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override /** Return perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override /** Return a string description of the object */
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter(); 
	}
}