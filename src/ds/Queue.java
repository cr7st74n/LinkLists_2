package ds;

public class Queue {

	public int size;
	public int[] array;
	public int head;
	public int tail;

	public Queue () {
		size = 0;
		array = null;
		head = 0;
		tail = 0;
	}

	public Queue (int _size) {
		size = _size;
		array = new int[size];
		head = 0;
		tail = 0;
	}

	/*
	 * Implement the ENQUEUE(Q, x) function
	 */
	public void enqueue (int x) {
		if ((tail+1 )% size == head){
			return;
		}
		array[tail] = x;
		tail = tail+1 ;
	}


	/*
	 * Implement the DEQUEUE(Q) function
	 */
	public int dequeue () {
		int x = array[head];
		if (head == tail){
			head = 1;
			return -1;
		}
		head = head+1;
		return x;
	}


	public String toString () {
		String str;
		str = size + ", " + head + ", " + tail + ", [";
		for (int i = head; i%size < tail; i++)
			str += array[i] + ",";
		str += "]";
		return str;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue q;

		q = new Queue(10);
		for (int i = 0; i < q.size; i++) //testing the queue with array 10 and adding 9 elements
			q.enqueue(i);
		System.out.println(q.toString());
		for (int i = 0; i < 5; i++)     // deleting 5 elements from the queue
			q.dequeue();
		System.out.println(q.toString());

		System.out.println("---------------------------------------------");

		Queue r;
		r = new Queue(20);

		for (int i = 0; i < 5; i++)
			r.dequeue();
		System.out.println(r.toString());
	}

}
