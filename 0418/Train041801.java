//정수 제곱 표시
package javatrain03;

import java.util.Scanner;

public class Train041801 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("정숫값 :");
	int n = stdIn.nextInt();
	for(int i=1; i<=n; i++)
		System.out.println(i+"의 제곱은 "+i*i+"입니다.");

	}

}
