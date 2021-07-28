package day04;

import java.util.Scanner;

public class Quiz01_3 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a;
		System.out.println("정수를 입력 해주세요 : ");
		a=pulls.nextInt();
		if (a<40)
			System.out.println("40보다 작은수");
		else if(a>60)
			System.out.println("60보다 큰 수");
		else 
			System.out.println("40 ~ 60 을 포함하는 수");
		
	}
}

