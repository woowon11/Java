/**
 * 2023.03.28
 * 정우원
 * 입력된 숫자가 양수, 0, 음수인지 판별하는 프로그램
 */
package chap04;

import java.util.Scanner;
public class Testex2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		int number = stdin.nextInt();
		
		if (number > 0)
			System.out.println("입력된 수는 양수입니다");
		else if (number == 0)
			System.out.println("입력된 수는 0입니다.");
		else 
			System.out.println("입력된 수는 음수입니다.");
	}

}
