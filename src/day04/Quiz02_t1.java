package day04;

import java.util.Scanner;

public class Quiz02_t1 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a,b;
		System.out.print("��¥ �Է� ���ּ���");
		a=pulls.nextInt();
		b=a%7;
		switch (b) {
		case 0: System.out.println(a+" ��"); break;
		case 1: System.out.println(a+" ��"); break;
		case 2: System.out.println(a+" ȭ"); break;
		case 3: System.out.println(a+" ��"); break;
		case 4: System.out.println(a+" ��"); break;
		case 5: System.out.println(a+" ��"); break;
		case 6: System.out.println(a+" ��"); break;
		}
		pulls.close();
	}
}
