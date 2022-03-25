package Walmart;

public class MergeTwoArrLL {
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

	public static void main(String[] args) {
		MergeTwoArrLL RD = new MergeTwoArrLL();
		
		MergeTwoArrLL SD = new MergeTwoArrLL();
		
		
		RD.insert(1);
		RD.insert(2);
		RD.insert(4);
		RD.printList();
		//System.out.println(" ");
		SD.insert(1);
		SD.insert(3);
		SD.insert(4);
		
		
		
	}
	

}
