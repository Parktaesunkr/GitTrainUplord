//두 숫자 사이에 있는 수
package javatrain01;

import java.util.Scanner;

public class Train0414_04 {
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("정수 A :"); int a = stdIn.nextInt();
	System.out.println("정수 B :"); int b = stdIn.nextInt();
	if(a>b) {int t= a;
	a = b;
	b = t;}
	do {
		System.out.print(a+" ");
		a = a + 1;
	} while (a <= b);
	System.out.println();
	}
}