import java.util.NoSuchElementException;

public class DNode <E>{
	private E item;
	private DNode previous;
	private DNode next;
	
	public DNode(E newitem, DNode p, DNode q) {
		item = newitem;
		previous = p;
		next =q;
	}
	
	public E getitem() {return item;}
	public DNode getPrevious() { return previous;}
	public DNode getNext() {return next;}
	public void setitem(E newitem) { item = newitem;}
	public void setPrevious(DNode p) {previous = p;}
	public void setNext(DNode q ) {next = q;}
	
}