package day04;

import java.util.Scanner;

public class Quiz01_mine {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int a;
		System.out.print("����� ������ �Է� ���ּ��� : ");
		a=pulls.nextInt();
		if(a>=90)
			System.out.println("����� ������ A�Դϴ�.");
		else if(a>=80)
			System.out.println("����� ������ B�Դϴ�.");
		else if(a>=70)
			System.out.println("����� ������ C�Դϴ�.");
		else if(a>=60)
			System.out.println("����� ������ D�Դϴ�.");
		else
			System.out.println("����� ������ F�Դϴ�. ����� ���հ��Դϴ�.");
		
	}
}
