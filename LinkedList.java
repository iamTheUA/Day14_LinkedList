package DataStr_Day14;

public class LinkedList {
	Node  head = null;
	int size = 0;

	public void add(int data) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	public void append(int data) {
		Node  node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			Node  n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		size++;
	}

	public void insert(int data, int pos) {
		if (pos <= size) {
			Node  node = new Node();
			node.data = data;
			Node  n = head;
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
			Node  n = head;
			for (int i = 1; i < size - 1; i++) {
				n = n.next;
			}
			n.next = null;
			size--;
		} else {
			System.out.println("Empty List");
		}
	}

	public void show() {
		Node  node = head;
		if (size > 0) {
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		} else {
			System.out.print("Empty List");
		}
		System.out.println();
	}

	public int search(int data) {
		if (size > 0) {
			Node  n = head;
			int pos = 1;
			while (n.next != null) {
				if (n.data == data) {
					break;
				}
				n = n.next;
				pos++;
			}
			return pos;

		} else {
			System.out.print("Empty List");
			return -1;
		}

	}

	public void addAfter(int toAddData, int afterData) {
		insert(toAddData, search(afterData) + 1);
	}

	public int size() {
		return size;
	}

	public void remove(int data) {
		if (size > 0) {
			Node  n = head;
			for (int i = 1; i < search(data) - 1; i++) {
				n = n.next;
			}
			n.next = n.next.next;

		} else {
			System.out.print("Empty List");
		}
	}

	public void sort() {
		
		int [] a = new int[size];
		Node  n = head;
		int temp =0;
		int i=0;
		while(n.next!=null) {
			a[i]=0;
			a[i]=(int)n.data;
			i++;
			n=n.next;
		}
		System.out.println();

		a[i]=0;
		a[i]=(int)n.data;	
		 for(i=0 ; i<size; i++) {

				for(int j=i; j<size; j++) {
					if ( a[i] > a[j]) {
						temp = a[j];
						a[j] = a[i];
						a[i]= temp;
					}
				}
			}
		 n=head;
		 i=0;
		 while(n.next!=null) {
			 n.data = a[i];
			 i++;
			 n=n.next; 
		 }
		 n.data=a[i];
		 }
}
