package ds;

public class LinkedList {

	public ListNode head;

	public LinkedList () {
		head = null;
	}

	/*
	 * Implement the LIST-SEARCH(L, k) function
	 */
	public ListNode search (int k) {
		ListNode x = head;
		while (x != null && x.key != k) {
			x = x.next;
		}
		return x;
	}

	/*
	 * Implement the LIST-INSERT(L, x) function
	 * Note that x is a integer value, not a ListNode
	 */
	public void insert (int x) {
		ListNode insertNode = new ListNode(x);
		insertNode.next = head;

		if (head == null) {
			head = insertNode;
		}
		head = insertNode;
		insertNode.prev = null;
	}

	/*
	 * Implement the LIST-DELETE(L, x) function
	 */
	public void delete (ListNode x) {
		if (x.prev != null){
			x.prev.next = x.next;
		}else {
			head = x.next;
		}

		if(x.next != null){
			x.next.prev = x.prev;
		}
	}


	public String toString () {
		String str;
		ListNode x;

		str = "[";
		x = this.head;
		while (x != null) {
			str += x.key + ",";
			x = x.next;
		}

		str += "]";
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList l;

		l = new LinkedList();
		for (int i = 0; i < 5; i++)
			l.insert(i);
		System.out.println(l.toString());
		for (int i = 0; i < 1; i++)       // Sometimes works, but it does not work with values >= 3
			l.delete(l.head.next);
		System.out.println(l.toString());
	}

}
