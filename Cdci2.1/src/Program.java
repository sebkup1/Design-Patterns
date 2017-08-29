import java.util.Hashtable;

public class Program {

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node ndup = new Node(2);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node ndup2 = new Node(2);
		Node n7 = new Node(7);
		Node n8 = new Node(8);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = ndup;
		ndup.next = n5;
		n5.next = n6;
		n6.next = ndup2;
		ndup2.next = n7;
		n7.next = n8;

		Node n = n1;

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		
		deleteDups(n1);
		
		n = n1;
		System.out.println("");
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public static void deleteDups(Node n) {
		Hashtable table = new Hashtable();
		Node previous = null;
		while (n != null) {
			if (table.containsKey(n.data))
				previous.next = n.next;
			else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}

}
