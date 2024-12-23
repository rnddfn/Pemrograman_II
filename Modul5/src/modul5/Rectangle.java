package modul5;

public class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(double l, double w) {
		super("Rectangle");
		this.length = l;
		this.width = w;
	}
	@Override
	public double area() {
		return length * width;
	}
	
	@Override
	public String toString() {
		return super.toString() + " length " + length + " and width " + width; 
	}
}