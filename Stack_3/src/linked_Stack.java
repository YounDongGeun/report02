class linked_Stack {
	
	public static void main(String[] args) {

		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printlnStack();
		
		LS.push('B');
		LS.printlnStack();
		
		LS.push('C');
		LS.printlnStack();
		
		deletedItem = LS.pop();
		if(deletedItem != 0)
			System.out.println("delted Item : " + deletedItem);
		LS.printlnStack();
	}

}