//*,+카운트
package javatrain01;

import java.util.Scanner;

public class Train0414_09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개를 표시할까요? :");
		int n = stdIn.nextInt();
		if(n>0) {
			int i = 0;
			while(i < n){
			if(i%2 == 0)
			{System.out.print('*');}
			else {System.out.print('+');}
			i++;}
	}
System.out.println();
}
}