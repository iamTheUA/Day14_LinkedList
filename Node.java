package DataStr_Day14;

public class Node implements Comparable <Node>{
	int data;
	Node next = null;
	
	@Override
	public int compareTo(Node o) {
		if((int)this.data > (int)o.data)
			return 1;
		else if((int)this.data < (int)o.data)
			return -1;
		else
			return 0;
	}
}
