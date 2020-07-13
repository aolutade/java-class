package helloworld.happy;


public class ExampleLinkedList {
	
	public static void main(String[] args) {
		
		Node node4 = new Node("Soccer",null);
		
		Node node3 = new Node("Football",null);
		
		Node node2 = new Node("Basketball",null);
		
		Node node1 = new Node("Baseball",null);
		
		node1.setNext(node2);
		
		node2.setNext(node3);
		
		node3.setNext(node4);		
		
		Node current = node1;
		
		while (current != null) {
			
			System.out.println(current.getSport());
			
			current = current.getNext();
			
		}
		
		System.out.println("Finish");
		//LinkedList<String> apple = new LinkedList<String>();
	}
	
	
}
