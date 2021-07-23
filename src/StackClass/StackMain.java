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
		System.out.println("");
		
		//inserting element to queue
		System.out.println("inserting element into queue ::");
		UC3 uc3=new UC3();
		uc3.addNode(56);
		uc3.addNode(30);
		uc3.addNode(70);
		uc3.printList();
		System.out.println("");
		
		//deleting element from queue
		System.out.println("deleting element from queue ::");
		UC4 uc4=new UC4();
		uc4.addNode(56);
		uc4.addNode(30);
		uc4.addNode(70);
		uc4.printList();
		uc4.deleteHead();
		uc4.printList();
		System.out.println("");
		

	}
}
