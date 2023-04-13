/**
 * 2023.03.28
 * 정우원
 * while(반복문) - 1~10합계 구하기
 */
package chap05;

public class WhileTest {

	public static void main(String[] args) {
		//while 반복문
		
		int sum=0, cnt=1;

		while (cnt <= 10)
			{	
				sum = sum + cnt;
				cnt = cnt + 1;
			}
		System.out.println("1~10까지의 합계(while) : " + sum);
		
		// for 반복문
		
		int i, total = 0;
		for (i = 1; i <= 10; i++)
			{
				total = total + i;
			
			}
		System.out.println("1~10까지의 합계(for) : " + sum);
	
		//do-while 반복문
		
		int hap = 0,count = 1;
		
		do 
		{
			hap = hap + count;
			count = count + 1;
		} while(count <= 10);
		System.out.println("1~10까지의 합계(do-while) : " + hap);
	
	}

}
