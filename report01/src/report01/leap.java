package report01;

import java.util.Scanner;

public class leap {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("년도를 입력하시오 : ");
	        int iYear = scanner.nextInt();
	       if(iYear % 4 == 0) 
	            PrintLeap();	       
	        else
	            PrintNotLeap();             
	       BR();
	    }
	    
	    
	    public static void PrintLeap()
	    {
	        System.out.println("윤년입니다.");     

	    }
	    public static void PrintNotLeap()

	    {
	        System.out.println("윤년이 아닙니다.");
	    }
	    public static void BR()
	    {
	    	System.out.print("프로그램을 종료합니다.");
	    	System.exit(0);  	
	   }   
}
