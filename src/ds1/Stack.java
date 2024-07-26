package ds1;

public class Stack {
	public int size;
	public int top;
	public int[] array;
	
	public Stack () {
		size = 0;
		top = -1;
		array = null;
	}
	
	public Stack (int _size) {
		size = _size;
		top = -1;
		array = new int[size];
	}
	
	/*
	 * Implement the Stack-Empty(S) function
	 *
	 * Here we create our stack element and past it to the empty function
	 *
	 */
	public boolean empty () {
		if (top == 0){
			return true;
		}else
			return false;
	}
	
	/*
	 * Implement the Push(S, x) function
	 * Created our stack1 and insert in the next position the value X
	 *
	 */
	public void push (int x) {
		top = top +1;
		array[top] = x;
	}
	
	/*
	 * Implement the Pop(S) function
	 * Return -1 if the stack is empty
	 */
	public int pop(Stack stack1) {
		if (stack1.empty()){
			System.out.println("Stack is empty");
		}else if (stack1.top == stack1.top-1){
			return stack1.array[stack1.top+1];
		}
		return stack1.array[stack1.top+1];
	}
	
	
	public String toString () {
		String str;
		
		str = size + ", [";
		for (int i = 0; i <= top; i++)
			str += array[i] + ", ";
		
		str += "]";
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack s;
		
		s = new Stack(10);
		for (int i = 0; i < 5; i++)
			s.push(i);
		System.out.println(s.toString());
		
		for (int i = 0; i < 2; i++)
			s.pop(s);
		System.out.println(s.toString());
	}

}
