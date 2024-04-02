package archivos;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Instrucciones {
	public void exe() {
		Fibonacci fib = new Fibonacci();
		
		
		paresLista();
		imparesLista();
	}
	
	
			////////Lista sin impares
	public void paresLista() {
		List<Integer> listaNum = new ArrayList<Integer>();
		List<Integer> listaPar = new ArrayList<Integer>();
		Random rand = new Random(System.nanoTime());
		
		for(int b = 0; b < 15; b++) {
			listaNum.add(rand.nextInt(0,9999));
		}
		for(int c = 0; c < 15; c++) {
			if(listaNum.get(c) % 2 == 0) {
				listaPar.add(listaNum.get(c));
			}
		}
	}
			////////Lista sin pares
	public void imparesLista() {
		List<Integer> listaNum = new ArrayList<Integer>();
		List<Integer> listaImpar = new ArrayList<Integer>();
		Random rand = new Random(System.nanoTime());
		
		for(int b = 0; b < 15; b++) {
			listaNum.add(rand.nextInt(0,9999));
		}
		for(int c = 0; c < 15; c++) {
			if(listaNum.get(c) % 2 == 1) {
				listaImpar.add(listaNum.get(c));
			}
		}
	}
	
	/*
	public void exe() {
		List<Integer> sucesionFib = new ArrayList<Integer>();
		HashMap<String, Integer> miMapa = new HashMap<>();
		
		miMapa.put("uno", 1);
		miMapa.put("uno", 2);
		int value = miMapa.get("uno");
		System.out.println(miMapa);
		
		
	}//*/
	
}