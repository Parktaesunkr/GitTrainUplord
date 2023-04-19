//진수변환
package javatrain04;

import java.util.Scanner;

public class Train041905 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("정수 :");
	int x = stdIn.nextInt();
	System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n",x,x);
	}

}
