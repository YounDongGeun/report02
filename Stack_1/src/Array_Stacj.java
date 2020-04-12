class Array_Stack {
	public static void main(String args[]) {

		int stackSize = 5;
		char deleteItem;
		ArrayStack S = new ArrayStack(stackSize);

		S.push('A');
		S.printlnStack();

		S.push('B');
		S.printlnStack();

		S.push('C');
		S.printlnStack();

		deleteItem = S.pop();
		if(deleteItem != 0)
			System.out.println("deleted Item: " + deleteItem);
		S.printlnStack();

	}

}