//카운트다운
package javatrain02;

import java.util.Scanner;

public class Train041703 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("카운트다운 합니다.");
	int x;
	do {
		System.out.println("양의 정숫값 :");
		x = stdIn.nextInt();
	} while(x<=0);
	for(;x>=0;x--)
		System.out.println(x);

	}

}
