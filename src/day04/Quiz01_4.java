package day04;

import java.util.Scanner;

public class Quiz01_4 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a;
		System.out.println(" 나이를 입력해주세요 ");
		a=pulls.nextInt();
		if(a<8)
			System.out.println("아동입니다. 입장료는 500원 입니다.");
		else if(a<14)
			System.out.println("초등학생입니다. 입장료는 1000원입니다.");
		else if(a<20)
			System.out.println("청소년입니다. 입장료는 1500원입니다.");
		
	}
}
