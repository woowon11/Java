/**
 * 2023/04/04
 * 정우원
 * 입력받은 숫자의 팩토리얼 구하기
 * #문제분석
 * 변수 : fac, facvalue
 * #알고리즘
 * 1. 팩토리얼 구할 수 입력 (fac)
 * 2. 반복
 * while (fac > 1)
 * {
 * 		facvalue = fac을 1씩 감소하면서 곱하기
 * }
 * 3. 결과출력
 */
package chap05;

import java.util.Scanner;
public class WhileTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("팩토리얼을 구할 숫자 입력 : ");
		int fac = stdin.nextInt();
		int facvalue = fac;
		
		while (fac > 1)
		{
			System.out.print(fac + "*");
			facvalue = facvalue * --fac;
		}
		System.out.print("1 = " + facvalue);

		
	}

}
