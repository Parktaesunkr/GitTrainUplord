//중앙값구하기
package javatrain;

import java.util.Scanner;

public class Train8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 a:"); int a = stdIn.nextInt();
		System.out.println("정수 b:"); int b = stdIn.nextInt();
		System.out.println("정수 c:"); int c = stdIn.nextInt();
		
		int med;
		if(a >= b) {if(b >= c) {med = b;} 
		else if(a <= c) {med = a;}
		else med = c;}
		else if (a > c) {med =a;}
		else if(b > c) {med =c;}
		else med = b;
		System.out.println("중앙값은" + med + "입니다.");

	}

}
