package day04;

import java.util.Scanner;

public class Quiz01_2 {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int a,b,c;
		System.out.println("���� 3���� �Է� ���ּ��� : ");
		a=pulls.nextInt();
		b=pulls.nextInt();
		c=pulls.nextInt();
		if((a+b+c)>100)
			System.out.println("�հ� ");
		else 
			System.out.println("���հ� ");
		
	}
}
