public class Postfix_test {

	public static void main(String args[]) {

		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("\nÈÄÀ§Ç¥±â½Ä : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n¿¬»ê°á°ú  = %d \n", result);
	}
}