package StackClass;

public class StackMain {
	public static void main(String[] args) {
		//add element to stack
		System.out.println("inserting element into stack ::");
		UC1 uc1=new UC1();
		uc1.addNode(70);
		uc1.addNode(30);
		uc1.addNode(56);
		System.out.println("");
		//deleting stack head element
		System.out.println("deleting element ::");
		UC2 uc2=new UC2();
		uc2.addNode(70);
		uc2.addNode(30);
		uc2.addNode(56);
		uc2.printList();
		uc2.deleteHead();
		uc2.printList();
		uc2.deleteHead();
		uc2.printList();
		uc2.deleteHead();
		

	}
}
