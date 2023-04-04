/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원,50원, 10원짜리 동전으로 교환해 주는 프로그램 작성
 * 조건1:동전의 총개수를 최소화
 * 조건2:고액의 동전 우선 교환
 * 
 */

package chap03;

import java.util.Scanner;


public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("금액을 입력하시오: ");
		int a=stdin.nextInt();
		
		System.out.println("500원 : " + a / 500 + "개");
		a %= 500; //a = a % 500
		System.out.println("100원 : " + a / 100 + "개");
		a %= 100;
		System.out.println("50원 : " + a / 50 + "개");
		a %= 50;
		System.out.println("10원 : " + a / 10 + "개");
		
		
	}

}
