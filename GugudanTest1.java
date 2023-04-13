package chap05;

import java.util.Scanner;
public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int dan = stdin.nextInt();
		int i = 1;
		
		for (i = 1; i <= 10; i++)
		{
			System.out.println(dan + "*" + i + "=" + dan*i);
		}	
	}

}
