package Uno;

public class Extra {
	public void fizzBuzz() {
		for(int a = 1; a < 101; a++) {
			if(a%3 == 0) {
				System.out.print("Fizz");
			}if(a%5 == 0) {
				System.out.print("Buzz");
			}else if(a%3 != 0) {
				System.out.print(a);
			}
			System.out.print(", ");
		}
	}
}
