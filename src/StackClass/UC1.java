package StackClass;


public class UC1 {
	Node head;
	
	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		printList();
	}
	
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}

}
