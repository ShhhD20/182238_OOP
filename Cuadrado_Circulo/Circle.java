package Figuras;

public class Circle {
	double id;
	
	public Circle(double id) {
		this.id = id;
		
		Square cuad = new Square();
		cuad.proceso(this);
	}
}
