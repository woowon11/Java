/**
 * 2023/04/04
 * 정우원
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력하기
 * #문제분석
 * -변수 : first, second, total
 * #알고리즘
 * 1. 정수 2개를 입력받기(first, second)
 * 2. 선택문(if(first < second))
 * 3. 반복문(for)
 */
package chap05;

import java.util.Scanner;
public class TestEx5 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("두개의 숫자입력 : ");
		int first = stdin.nextInt();
		int second = stdin.nextInt();
		int i, total = 0;
		
		if (first > second)
		{
			i = first;
			first = second;
			second = i;
		}
		
		for (i = first; i <= second; i++)
		{
			total = total + i;
			
		}
		System.out.println(total);

	}

}
