class Node {
	private String data;
	public Node link;
	public Node() {
		this.data = null;
		this.link = null;
	}
	public Node(String data) {
		this.data = data;
		this.link = null;
	}
	public Node(String data, Node link) {
		this.data = data;
		this.link = link;
	}
	public String getData() {
		return this.data;
	}
}

class LinkedList{
	private Node head;
	public LinkedList() {
		head = null;
	}
	public void insertMiddleNode(Node pre, String data) {
		Node newNode = new Node(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	public void insertLastNode(String data) {
		Node newNode = new Node(data);
		if(head ==null) {
			this.head = newNode;
		} else {
			Node temp = head;
			while(temp.link != null) temp = temp.link;
			temp.link = newNode;
		}
	}
	public void deleteLastNode() {
		Node pre, temp;
		if(head == null) return;
		if(head.link == null) {
			head =null;
		}else {
			pre =head;
			temp = head.link;
			while(temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
	}
	public Node searchNode(String data) {
		Node temp = this.head;
		while(temp != null) {
			if(data == temp.getData())
				return temp;
			else temp = temp.link;
		}
		return temp;
	}
	public void reverseList() {
		Node next = head;
		Node current = null;
		Node pre = null;
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		}
		head = current;
	}
	public void printList() {
		Node temp = this.head;
		System.out.print("L = (");
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
	
}