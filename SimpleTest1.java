/**
 * 2023.03.28 
 * 정우원
 * 조건문 연습
 */
package chap04;

import java.util.Scanner;

public class SimpleTest1 {

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int grade = stdin.nextInt();
	
		if (grade >= 90)
		{	System.out.println("합격입니다.");
			System.out.println("축하드립니다.");
			System.out.println("감사합니다.");
		}
	
		else
			System.out.println("불합격입니다.");
	}

}
