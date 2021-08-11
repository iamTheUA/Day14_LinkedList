package DataStr_Day14;

public class LinkedList<T> {
	Node<T> head = null;
	int size = 0;

	public void add(T data) {
		Node<T> node = new Node<>();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	public void append(T data) {
		Node<T> node = new Node<>();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		size++;
	}

	public void insert(T data, int pos) {
		if (pos <= size) {
			Node<T> node = new Node<>();
			node.data = data;
			Node<T> n = head;
			for (int i = 1; i < pos - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			size++;
		} else if (pos == 1) {
			add(data);
		} else {
			System.out.println("Out of Size");
		}

	}

	public void pop() {

		if (head == null) {
			System.out.println("Empty List");
		} else {
			head = head.next;
			size--;
		}
	}

	public void popLast() {
		if (size > 0) {
			Node <T> n = head;
			for (int i = 1; i < size-1; i++) {
				n=n.next;
			}
			n.next=null;
			size--;
		} else {
			System.out.println("Empty List");
		}
	}

	public void show() {
		Node<T> node = head;
		if (size > 0) {
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		} else {
			System.out.print("Empty List");
		}
	}
	
	public int search(T data) {
		if(size>0) {
			Node<T> n = head;
			int pos = 1;
			while(n.next!=null) {
				if(n.data==data) {
					break;
				}
				n=n.next;
				pos++;
			}
			return pos ;
			
		}else {
			System.out.print("Empty List");
			return -1 ;
		}
		
	}
	
	public void addAfter(T data) {
		insert(data, search(data));
	}
	
	public int size() {
		return size;
	}
	
	public void remove(T data){
		if(size>0) {
			Node <T> n = head;
			for(int i = 1 ; i< search(data)-1 ; i++) {
				n=n.next;
			}
			n.next=n.next.next;
			
		}
		else {
			System.out.print("Empty List");
		}
	}
}
