package Uno;
import java.util.Scanner;

public class Process {
	public void iniciarPrograma() {
		Palabras comand = new Palabras();
		Extra bonus = new Extra();
		String primero = "hasta luego cocodrilo";
		String segundo = "anita lava la tina";
		Scanner scan = new Scanner(System.in);
		
		comand.primeraMayuscula(primero);
		comand.invertirCadena(primero);
		comand.vocalesMayuscula(primero);
		comand.palindromo(primero);
		System.out.println(" ");
		comand.primeraMayuscula(segundo);
		comand.invertirCadena(segundo);
		comand.vocalesMayuscula(segundo);
		comand.palindromo(segundo);
		
		System.out.println("Deseas ejecutar el FizzBuzz? [1] Si   [0] No");
		String preg = scan.nextLine();
		int res = Integer.parseInt(preg);
		if(res == 1) {
			bonus.fizzBuzz();
		}
	}
}
