//피라미드 표시
package javatrain03;

import java.util.Scanner;

public class Train041806 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("피라미드를 표시합니다.");
	System.out.println("단수는? :");
	int n = stdIn.nextInt();
	
	for(int i =1; i<=n; i++) {
		for(int j=1;j<=n-i;j++)
			System.out.print(' ');
		for(int j=1; j<=2*i-1;j++)
			System.out.print('*');
		System.out.println();
	}
	}

}
