package DataStr_Day14;

public class LinkedList<T> {
	Node<T> head = null;

	public void add(T data) {
		Node <T> node = new Node<>();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			node.next=head;
			head=node;
		}
	}
	public void show() {
		Node<T> node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
