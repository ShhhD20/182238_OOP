package Figuras;

public class Square {
	Circle cir;
	double lado;
	
	public Square() {
		this(1822.38);
	}
	public Square(double lado) {
		this.lado = lado;
	}
	
	void proceso(Circle ci) {
		this.cir = ci;
		
		System.out.println(ci);
	}
}
