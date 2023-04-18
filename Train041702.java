//*카운트
package javatrain02;

import java.util.Scanner;

public class Train041702 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?");
		int n = stdIn.nextInt();
		if(n>0) {
			for(int i=0; i<n; i++)
				System.out.print('*');
			System.out.println();
		}
	}

}
