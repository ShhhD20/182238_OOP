package actividadExtra;

public class Proceso {
	public int recorrer(int fin) {
		RecorrerArray arreglo = new RecorrerArray();
		if(fin == 0) {
			return 0;
		}
		System.out.print(arreglo.exe(recorrer(fin-1)) + ", ");
		return fin;
	}
	public void fib(int a, int b, int hist, int hist2) {
		Fibonacci serie = new Fibonacci();
		int res;
		if(b < a) {
			res = serie.exe(b, hist, hist2);
			System.out.print(res + ", ");
			b ++;
			hist2 = hist;
			hist = res;
			if (b == 1) hist = 1;
			fib(a, b, hist, hist2);
		}
	}
	
	public void exe() {
		BuscaArray navegar = new BuscaArray();
		int tamagnoArreglo = 5;
		int valorBuscado = 3;
		int fibSize = 9;
		
		System.out.print("Arreglo: ");
		recorrer(tamagnoArreglo);
		System.out.println("\nEl valor " + valorBuscado + " esta en la posicion \"" + navegar.exe(valorBuscado) + "\" (Si es negativo no existe)(Comienza desde 0)");
		System.out.print("Elementos de la serie: ");
		fib(fibSize, 0, 0, 0);
	}
}
