//소수 판정
package javatrain03;

import java.util.Scanner;

public class Train041808 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	int n;
	do {
		System.out.print("2이상의 정숫값 :");
		n = stdIn.nextInt();
	} while (n < 2);
	
	int i;
	for(i = 2;i < n;i++)
		if(n % i ==0)
			break;// 나누어 떨어진다(소수가 아니다)
	
		if(i == n)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");

	}

}
