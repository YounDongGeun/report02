public class Node <E extends Comparable<E>>{
	private E item;
	private Node next;
	
	public Node(E newitem, Node<E> p) { 
		item = newitem;
		next = p;
	}
	
	public E getitem() {return item;}
	public Node getNext() {return next;}
	public void setitem(E newitem) {item = newitem;}
	public void setNext(Node n) {next = n;}
}