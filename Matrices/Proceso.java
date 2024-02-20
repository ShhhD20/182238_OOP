package metodosMatrices;
import java.util.Scanner;
import java.util.Random;

public class Proceso {
	public void exe() {
		Random random = new Random();
		Matrices ejecutar = new Matrices();
		Scanner scan = new Scanner(System.in);
		String size;
		int intSize;
		String operac;
		int intOperac;
		int[][] Matriz, MatrizEx;
		String escalar;
		int intEscalar;
		System.out.println("NOTA. Los valores son aleatorios");
		
		while (true) {
			System.out.println("\nQue tamagno tienen los arreglos? ");
			size = scan.nextLine();
			intSize = Integer.parseInt(size);
			Matriz = new int[intSize][intSize];
			MatrizEx = new int[intSize][intSize];
			for(int a = 0; a < intSize; a++) {
				for(int b = 0; b < intSize; b++) {
					Matriz[a][b] = random.nextInt(10);
					MatrizEx[a][b] = random.nextInt(10);
				}
			}
			
			System.out.println("Que operacion quiere hacer?\n\t[1] Suma diagonal\t\t[4] Matriz por escalar");
			System.out.println("\t[2] Encontrar maximo\t\t[5] Multiplicar matrices");
			System.out.println("\t[3] Sumar matrices\t\t[6] Transponer matriz");
			System.out.println("\t[0] Salir");
			operac = scan.nextLine();
			intOperac = Integer.parseInt(operac);
			
			switch(intOperac) {
			default:
				System.out.println("Respuesta invalida. Intente nuevamente.");
				break;
			case 0:
				System.out.println("Saliendo...");
				scan.close();
				System.exit(0);
				break;
			case 1:
				ejecutar.sumaDiagonal(Matriz);
				break;
			case 2: 
				ejecutar.encuentraElMaximo(Matriz);
				break;
			case 3:
				ejecutar.sumaDosMatrices(Matriz, MatrizEx);
				break;
			case 4:
				System.out.println("Ingrese valor de escalar: ");
				escalar = scan.nextLine();
				intEscalar = Integer.parseInt(escalar);
				ejecutar.matrizPorEscalar(Matriz, intEscalar);
			case 5:
				ejecutar.multiplicaMatrices(Matriz, MatrizEx);
				break;
			case 6:
				ejecutar.transponer(Matriz);
				break;
			}
		}
	}
}
