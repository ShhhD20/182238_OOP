package metodosMatrices;
import java.util.Random;
import java.util.Scanner;

public class Matrices {

Scanner scanner = new Scanner(System.in);
Random random = new Random();
	
	public void sumaDiagonal(int Matriz[][]) {

		int sumaDiagonal = 0;
      
        System.out.println("Matriz:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j] = random.nextInt(10);
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < Matriz.length; i++) {
            sumaDiagonal += Matriz[i][i];
        }

        System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);
		
	}
	
	public void encuentraElMaximo(int Matriz[][]) {
		int MAX = Matriz[0][0];
		int MaxA = 0, MaxB = 0;
		for(int a = 0; a < Matriz.length; a++) {
			for(int b = 0; b < Matriz[0].length; b++) {
				if(MAX < Matriz[a][b]) {
					MAX = Matriz[a][b];
					MaxA = a;
					MaxB = b;
				}
			}
		}
		System.out.println("El valor mas grande es: " + MAX + "\nEn la posicion [" + MaxA + "][" + MaxB + "]");
	}
	
	public void sumaDosMatrices(int[][] matriz1, int[][] matriz2) {
	        int[][] resultado = new int[matriz1.length][matriz1[0].length];

	     
	        for (int i = 0; i < matriz1.length; i++) {
	            for (int j = 0; j < matriz1[0].length; j++) {
	                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }

	      
	        imprimirMatriz("Matriz 1", matriz1);
	        imprimirMatriz("Matriz 2", matriz2);
	        imprimirMatriz("Resultado de la suma", resultado);
	    }

	    private void imprimirMatriz(String titulo, int[][] matriz) {
	        System.out.println("\n" + titulo + ":");
	        for (int[] fila : matriz) {
	            for (int elemento : fila) {
	                System.out.print(elemento + " ");
	            }
	            System.out.println();
	        }
	    }
		
	public void matrizPorEscalar(int [][] matrizPorEscalar, int escalar) {
		int filas = matrizPorEscalar.length;
		int columnas = matrizPorEscalar[0].length;
		int[][] resultado = new int[filas][columnas];
		
		for(int i = 0; i < filas;i++) {
			for(int j = 0; j < columnas; j++) {
				resultado[i][j] = matrizPorEscalar[i][j] * escalar;
			}
		}
		System.out.println("El producto de el escalar por la matriz es: " );
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				System.out.print(resultado[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
	
	public void multiplicaMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            System.out.println("Error: No se pueden multiplicar las matrices. El número de columnas de la primera matriz no coincide con el número de filas de la segunda matriz.");
            return;
        }

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("El resultado de la multiplicación de las matrices es:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
        
	public void transponer(int Matriz[][]) {
		int[][] MatrizT = new int[Matriz[0].length][Matriz.length];
		for(int a = 0; a < Matriz.length; a++) {
			for(int b = 0; b < Matriz[0].length; b++) {
				MatrizT[b][a] = Matriz[a][b];
			}
		}
		System.out.println("\nMatriz:");
		for(int e = 0; e < Matriz[0].length ; e++) {
			for(int f = 0; f < Matriz.length; f++) {
				System.out.print(" " + Matriz[e][f]);
			}
			System.out.println("");
		}
		System.out.println("\nMatriz transpuesta:");
		for(int c = 0; c < Matriz[0].length ; c++) {
			for(int d = 0; d < Matriz.length; d++) {
				System.out.print(" " + MatrizT[c][d]);
			}
			System.out.println("");
		}
	}
}