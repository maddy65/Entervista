package LinkedLIst;

public class Removenth {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data +" ");
			n = n.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Removenth RD = new Removenth();
		
		/*RD.insert(5);
		RD.insert(4);
		RD.insert(3);
		RD.insert(2);*/
		RD.insert(1);
		
		//System.out.println("List with duplicate values: ");
		//RD.printList();
		//RD.remove(2);
		//System.out.println("List with duplicate values: ");
		RD.printList();
		RD.printMiddle();
		RD.printList();

	}

	private void printMiddle() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count = count +1;
			temp = temp.next;
		}
		
		int mid = count/2;
		
		if(count == 1) {
			return;
		}
		Node prev = null;
		Node curr = head;
		while(mid > 0) {
			prev = curr;
			curr = curr.next;
			mid = mid-1;
		}
		
		prev.next = curr.next;
		curr.next = null;
			
	}

	private void remove(int i) {
		if(head == null) {
			return;
		}
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count = count +1;
			temp = temp.next;
		}
		count = count - i;
		Node prev = null;
		Node curr = head;
		while(count > 0) {
			prev = curr;
			curr = curr.next;
			count = count-1;
		}
		
		prev.next =  curr.next;
		curr.next = null;
		
	}

}
