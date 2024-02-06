package Uno;

public class Palabras {
	public void primeraMayuscula(String cadena) {
		System.out.println("\tPrimera mayuscula:");
		String primer = cadena.substring(0,1);
		String fin = primer.toUpperCase();
		int tamagno = cadena.length();
		fin = fin + cadena.substring(1,tamagno);
		System.out.println(fin);
	}
	public void invertirCadena(String chain) { 
		System.out.println("\tInvertir cadena:");
		int length = chain.length();
		String inverso = chain.substring(length-1,length);
		for(int d = length-1; d > 1; d--) {
			inverso += chain.substring(d-1,d);
		}
		System.out.println(inverso);
	}
	public void vocalesMayuscula(String str) {
		System.out.println("\tVocales Mayusculas:");
		String newStr = str.replace('a', 'A');
		newStr = newStr.replace('e', 'E');
		newStr = newStr.replace('i', 'I');
		newStr = newStr.replace('o', 'O');
		newStr = newStr.replace('u', 'U');
		System.out.println(newStr);
	}
	public void palindromo(String cad) {
		System.out.println("\tPalindromo:");
		int dist = cad.length();
		String sinEspacios = cad.substring(0,0);
		String inver = cad.substring(dist, dist);
		for(int b = 0; b < dist; b++) {
			if(cad.charAt(b) != ' ') {
				sinEspacios = sinEspacios + cad.charAt(b);
			}
		}
		for(int c = dist - 1; c >= 0; c--) {
			if(cad.charAt(c) != ' ') {
				inver = inver + cad.charAt(c);
			}
		}
		System.out.println(inver.contains(sinEspacios));
	}
}
