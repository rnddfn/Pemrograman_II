package modul5;

public class Paint {
	double coverage;
	
	public Paint(double c) {
		this.coverage = c;
	}
	
	public double amount(Shape s) {
		System.out.println("Computing amount for " + s);
		return s.area() / coverage;
	}
}
