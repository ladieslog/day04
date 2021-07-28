package day04;

import java.util.Scanner;

public class Quiz01_2 {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int a,b,c;
		System.out.println("정수 3개를 입력 해주세요 : ");
		a=pulls.nextInt();
		b=pulls.nextInt();
		c=pulls.nextInt();
		if((a+b+c)>100)
			System.out.println("합격 ");
		else 
			System.out.println("불합격 ");
		
	}
}
