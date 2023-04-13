/**
 * 2023.03.28
 * 정우원
 * 조건문 연습
 */
package chap04;

import java.util.Scanner;
public class SimpleTest2 {
	

	public class SimpleTest1 {

		public static void main(String[] args)
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("점수 입력 : ");
			int grade = stdin.nextInt();
			
			if (grade >= 90)
				System.out.println("A");
			else if (grade >= 80)
				System.out.println("B");
			else if (grade >= 70)
				System.out.println("C");
			else if (grade >= 60)
				System.out.println("D");
			else
				System.out.println("F");
		
		}

	}
}
