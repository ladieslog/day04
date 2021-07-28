package day04;

import java.util.Scanner;

public class Quiz02_t1 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a,b;
		System.out.print("날짜 입력 해주세요");
		a=pulls.nextInt();
		b=a%7;
		switch (b) {
		case 0: System.out.println(a+" 일"); break;
		case 1: System.out.println(a+" 월"); break;
		case 2: System.out.println(a+" 화"); break;
		case 3: System.out.println(a+" 수"); break;
		case 4: System.out.println(a+" 목"); break;
		case 5: System.out.println(a+" 금"); break;
		case 6: System.out.println(a+" 토"); break;
		}
		pulls.close();
	}
}
