package Figuras;

public class Cuadrado { 
	
	double diagonal(double lado) {
		double resultado;
		resultado = 1.4142 * lado;
		return resultado;
	}
	double perimetro(double lado) {
		double resultado;
		resultado = lado * 4;
		return resultado;
	}
	double area(double lado) {
		double resultado;
		resultado = lado * lado;
		return resultado;
	}
}
