/**
 * 윤년 계산 프로그램
 * 조건1:4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년이다.
 * 조건2:400으로 나누어 떨어지는 해도 윤년에 포함 된다.
 * 
 * 실행결과
 * 년도 입력: 2020
 * 2020년은 윤년입니다.
 */
package chap03;

import java.util.Scanner;
public class OpEx2 {
	
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year=stdin.nextInt();
		boolean b; //boolean : True,False 값
		
		b = year % 4 == 0 && year % 100 != 0 ? true : year % 400 == 0 ? true : false;
		System.out.println(year + "은 " + (b ? "윤년입니다." : "윤년이 아닙니다."));
	}

}
