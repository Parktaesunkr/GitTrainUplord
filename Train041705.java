//시그마
package javatrain02;

import java.util.Scanner;

public class Train041705 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("1부터 n까지의 합을 구합니다.");
	int n;
	do {
		System.out.println("n의 값");
	n = stdIn.nextInt();
	} while(n<=0);
	int sum = 0;
	for(int i = 0; i <= n; i++)
		sum += i;
	System.out.println("1부터" + n+ "까지의 합은" + sum + "입니다.");

	}

}
