package Figuras;
import java.util.Scanner;

public class Instrucciones {
	public static void main(String[] args) {
		Cuadrado calculoCuad = new Cuadrado();
		Circulo calculoCirc = new Circulo();
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Que figura quiere hacer?\n\t[1] Cuadrado\n\t[2] Circulo\n\t[3] Salir");
			String figura = scan.nextLine();
			int intEscaneado = Integer.parseInt(figura);
			
			switch(intEscaneado) {
				case 1:
					System.out.println("Que medida el lado?");
					String lado = scan.nextLine();
					double douLado = Double.parseDouble(lado);
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
					System.out.println("Que medida el radio?");
					String radio = scan.nextLine();
					double douRadio = Double.parseDouble(radio);
					System.out.println("Que desea calcular?\n\t[1] Circunferencia\n\t[2] Area");
					String oper = scan.nextLine();
					int intOper = Integer.parseInt(oper);
					switch(intOper) {
					case 1:
						System.out.println("La circunferencia mide: " + calculoCirc.circunferencia(douRadio)); break;
					case 2:
						System.out.println("El area mide: " + calculoCirc.area(douRadio)); break;
				} break;
				case 3:
					System.out.println("Saliendo...");
					System.exit(0);
					
				default:
					System.out.println("Respuesta invalida. Intente nuevamente.");
					break;
			}
			scan.close();
		}
	}
}
