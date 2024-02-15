package staksYcolas;

public class Queues {
	int MAX;
	int tail;
	char[] queue = new char[MAX];
	
	public void define(char[] arreglo, int tope) {
		MAX = arreglo.length;
		for(int a  = 0; a < arreglo.length; a++) {
			queue[a] = arreglo[a];
			if(arreglo[a] == ' ' && queue[tail] != ' ') {
				tail = a;
			}
		}
	}
	public void insert(char data) {
		if(tail == MAX)
			System.out.println("Queue is full");
		else {
			queue[tail] = data;
			tail++;
		}
	}
	public char delete() {
		char lost;
		if(tail == 0) {
			return '#';
		}else {
			lost = queue[0];
			for(int b = 0; b < tail; b ++) {
				queue[b] = queue[b+1];
			}
			tail--;
			return lost;
		}
	}
	
	
}
