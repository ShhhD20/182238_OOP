package Figuras;
import java.util.Scanner;

public class Instrucciones {
	public static void main(String[] args) {
		Cuadrado calculoCuad = new Cuadrado();
		Circulo calculoCirc = new Circulo();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Que figura quiere hacer?\n\t[1] Cuadrado\n\t[2] Circulo");
		String figura = scan.nextLine();
		int intEscaneado = Integer.parseInt(figura);
		System.out.println("Que medida el lado/radio?");
		String lado = scan.nextLine();
		double douLado = Double.parseDouble(lado);
		
		switch(intEscaneado) {
			case 1:
				System.out.println("Que desea calcular?\n\t[1] Diagonal\n\t[2] Perimetro\n\t[3] Area");
				String operacion = scan.nextLine();
				int intOperacion = Integer.parseInt(operacion);
				switch(intOperacion) {
					case 1:
						System.out.println("La diagonal mide: " + calculoCuad.diagonal(douLado)); break;
					case 2:
						System.out.println("El perimetro mide: " + calculoCuad.perimetro(douLado)); break;
					case 3:
						System.out.println("El area mide: " + calculoCuad.area(douLado)); break;
				} break;
			case 2:
				System.out.println("Que desea calcular?\n\t[1] Circunferencia\n\t[2] Area");
				String oper = scan.nextLine();
				int intOper = Integer.parseInt(oper);
				switch(intOper) {
				case 1:
					System.out.println("La circunferencia mide: " + calculoCirc.circunferencia(douLado)); break;
				case 2:
					System.out.println("El area mide: " + calculoCirc.area(douLado)); break;
			} break;
		}
		scan.close();
	}
}
