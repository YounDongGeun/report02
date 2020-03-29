package report01;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("원하는 숫자 : ");

        int num = scanner.nextInt();

        for(int j = 1;j <= 9; j++){
            System.out.println(num + " x " + j + " = " + (num * j) + " ");
        }
	}
}
