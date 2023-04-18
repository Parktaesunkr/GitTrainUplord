//정수가 음순지 양순지 확인
package javatrain01;


import java.util.Scanner;
public class Train0414_01 {

public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int retry;
	do {
		System.out.println("정숫값 :");
		int n = stdIn.nextInt();
			
		if(n>0) {
			System.out.println("이 값은 양수입니다.");}
			else if(n<0) {System.out.println("이 값은 음수입니다");}
			else {System.out.println("이 값은 0입니다.");}
			
		System.out.println("다시 한번? 1-Yes / 0-No:");
		retry = stdIn.nextInt();
		}while (retry==1);

	}
}

