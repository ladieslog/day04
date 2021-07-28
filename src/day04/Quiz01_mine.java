package day04;

import java.util.Scanner;

public class Quiz01_mine {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int a;
		System.out.print("당신의 점수를 입력 해주세요 : ");
		a=pulls.nextInt();
		if(a>=90)
			System.out.println("당신의 학정은 A입니다.");
		else if(a>=80)
			System.out.println("당신의 학정은 B입니다.");
		else if(a>=70)
			System.out.println("당신의 학정은 C입니다.");
		else if(a>=60)
			System.out.println("당신의 학정은 D입니다.");
		else
			System.out.println("당신의 학정은 F입니다. 당신은 불합격입니다.");
		
	}
}
