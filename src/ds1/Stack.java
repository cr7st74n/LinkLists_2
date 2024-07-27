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
		if (top < 0 ){
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
	public int pop() {
		if (empty()){
			System.out.println("Stack is empty");
			return -1;
		}else {
			return array[top--];
		}
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
		Stack t;
		
		s = new Stack(20);
		for (int i = 0; i < s.size; i++)
			s.push(i);

		System.out.println(s.toString());    // test the array with all the elements


		for (int i = 0; i < 5; i++)
			s.pop();

		System.out.println(s.toString());  // here is the array with less 5 elements

		System.out.println("-----------------------------------------------");

		t = new Stack(10);
		for (int i = 0; i < 5;i++)
			t.pop();
		System.out.println(t.toString());  // empty array
	}

}
