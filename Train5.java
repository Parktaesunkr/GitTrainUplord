//두값의 차의 크기가 10
package javatrain;

import java.util.Scanner;

public class Train5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 a:"); int a = stdIn.nextInt();
		System.out.println("정수 b:"); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a ;
		if(diff <=10) {System.out.println("두 값의 차는 10이하입니다.");}
		else 
		{System.out.println("두 값의 차는 11이상입니다.");}

	}
}