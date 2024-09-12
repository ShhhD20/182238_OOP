package Figuras;

public class Circulo {
	double pi = 3.11415926535;
	
	double circunferencia(double radio) {
		double resultado;
		resultado = radio * 2 * pi;
		return resultado;
	}
	
	double area(double radio) {
		double resultado;
		resultado = radio * radio * pi;
		return resultado;
	}
}
