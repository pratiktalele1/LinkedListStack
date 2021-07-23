package StackClass;

public class UC2 {
	Node head;
	
	//add element to stack
	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	//print stack
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	//deleting element 
	public void deleteHead() {
		System.out.println("deleting head node");
		Node temp=head;
		if(temp!=null) {
			head=temp.next;
		}
	}
}
