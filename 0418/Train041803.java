// *을이용한 정방형
package javatrain03;

import java.util.Scanner;

public class Train041803 {

	public static void main(String[] args) {
	Scanner stdIn =new Scanner(System.in);
	
	System.out.println("정방형을 표시합니다.");
	System.out.print("단수는 :");
	int n = stdIn.nextInt();
	
	for(int i=1; i<=n;i++) {
		for(int j=1;j<=n;j++)
			System.out.print('*');
		System.out.println();
	}

	}

}
