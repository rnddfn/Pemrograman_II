package modul5;

public class Cylinder extends Shape{
	double radius;
	double height;
	
	public Cylinder(double r, double h) {
		super("Cylinder");
		this.radius = r;
		this.height = h;
	}

	@Override
	public double area() {
		return Math.PI * radius * height;
	}
	
	@Override
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}
