/**
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * for문으로 작성
 * 입력한 수를 나누어서 나머지가 0 인 것이 배수 - 조건 
 */

package chap05;

import java.util.Scanner;
public class TestEx3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = stdin.nextInt();
		int i, total = 0;
		
		for (i = 1; i <= 1000; i++)
			{
				if (i % number== 0) 
				
				total = total + i;
			
			}
		System.out.print(total);
		
	}

}
