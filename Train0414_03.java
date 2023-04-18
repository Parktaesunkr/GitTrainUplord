//Random을 이용한 숫자맞추기
package javatrain01;

import java.util.Random;
import java.util.Scanner;

public class Train0414_03 {

	public static void main(String[] args) {
	Random rand = new Random();
	Scanner stdIn = new Scanner(System.in);
	int no = 10 + rand.nextInt(90);
	System.out.println("숫자 맞추기 게임 시작!");
	System.out.println("10부터 99사이의 숫자를 맞추세요.");
	int x;
	do {
		System.out.println("어떤 숫자일까?.");
		x = stdIn.nextInt();
		if(x > no) {System.out.println("더 작은 숫자입니다.");}
		else if(x <no) {System.out.println("더 큰 숫자입니다.");}
	} while (x !=no);
	System.out.println("정답입니다.");

	}

}
