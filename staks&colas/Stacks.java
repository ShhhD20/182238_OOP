package staksYcolas;

public class Stacks {
	int MAX;
	int top;
	char[] stack = new char[MAX];
	
	public void define(char[] arreglo, int tope) {
		MAX = arreglo.length;
		for(int a  = 0; a < arreglo.length; a++) {
			stack[a] = arreglo[a];
			if(arreglo[a] == ' ' && stack[top] != ' ') {
				top = a;
			}
		}
	}
	public void push(char data){
		if(top == MAX)
			System.out.println("Stack is full");
		else {
			stack[top] = data;
			top++;
		}
	}
	public char pop(){
		char lost;
		if(top == 0){
			return('#');
		}else {
			lost = stack[top];
			stack[top] = ' ';
			top--;
			return(stack[top]);
		}
	}
	
	
}
