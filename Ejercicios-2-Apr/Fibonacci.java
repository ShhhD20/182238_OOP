package archivos;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public void exe() {
		List<Integer> sucesionFib = new ArrayList<Integer>();
		int primer = 0, segundo = 1;
		int ans;
		
		sucesionFib.add(0);
		for(int a = 0; a < 1000; a++) {
			ans = fib(primer, segundo);
			
			if(ans > 1000000) {
				break;
			}
			sucesionFib.add(ans);
			segundo = primer;
			primer = ans;
		}
	}
	public int fib(int uno, int dos) {
		int res;
		res = uno + dos;
		return res;
	}
}
