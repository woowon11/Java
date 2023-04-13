/**
 * 정우원
 * 2023/04/04
 * 숫자를 반복적으로 입력 받아서 정수와 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */
package chap05;

import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int hap = 0;
		int cnt = 0;
		int num ;
		
		while (true)
		{
			System.out.print("숫자를 입력 : ");
			num = stdin.nextInt();
			hap = hap + num;
			cnt++;
			if (hap >= 1000) break;
		}
		System.out.println("1000을 넘긴 숫자 : " + num + " ,평균 : " + (hap/cnt));
		
		
	}

}
