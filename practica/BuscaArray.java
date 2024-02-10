package actividadExtra;

public class BuscaArray {
	public int buscador(int num, int pos) {
		int arreglo[] = {5,8,6,3,7};
		if(pos == 5) {
			return -1;
		}
		if(arreglo[pos] == num) {
			return pos;
		}else {
			return buscador(num, pos+1);
		}
	}
	public int exe(int num) {
		return buscador(num, 0);
	}
}
