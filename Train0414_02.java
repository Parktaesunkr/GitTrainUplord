//입력한 값중 세자릿대의 정숫값 구하기
package javatrain01;

import java.util.Scanner;

public class Train0414_02 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int x ;
	do {
	System.out.println("세 자리의 정숫값 :");
	x = stdIn.nextInt();
	}while( x < 100|| x > 999);
	System.out.print("입력한 값은" + x + "입니다.");

	}

}
