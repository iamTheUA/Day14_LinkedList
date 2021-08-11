package DataStr_Day14;

public class ListedListDay14 {
	
	public static void main(String[] asd) {	
		LinkedList list = new LinkedList();
		
		list.append(5);
		list.append(3);
		list.append(4);
		list.append(7);
		list.append(6);
		list.append(1);
//		list.addAfter(40, 30);;
//		list.remove(40);

	//	System.out.println(list.search(30));
		list.show();
		list.sort();
		list.show();
	}
}
