package Walmart;


public class SwapPairLL {
	
Node head;
	
	class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head =new_node;
		
	}
	
	private void swapPair() {
		Node temp = head;
		while(temp != null && temp.next != null) {
			int key = temp.data;
			temp.data = temp.next.data;
			temp.next.data = key;
			temp = temp.next.next;
		}
		
	}

	public static void main(String[] args) {
		SwapPairLL RD = new SwapPairLL();
		
		SwapPairLL SD = new SwapPairLL();
		
		RD.insert(1);
		RD.insert(2);
		RD.insert(3);
		RD.insert(4);
		RD.printList();
		RD.swapPair();
		
		System.out.println(" ");
		RD.printList();
	}

	

}
