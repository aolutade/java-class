package helloworld.happy;

public class Node {
	private String sport;
	private Node next;
	private Node tail;
	
	public Node(String sport,Node next) {
		this.sport = sport;
		this.next = next;
		
	}
	
	public void printValue() {
		System.out.println(sport);
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
