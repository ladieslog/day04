package day04;

import java.util.Scanner;

public class Quiz01_3 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a;
		System.out.println("������ �Է� ���ּ��� : ");
		a=pulls.nextInt();
		if (a<40)
			System.out.println("40���� ������");
		else if(a>60)
			System.out.println("60���� ū ��");
		else 
			System.out.println("40 ~ 60 �� �����ϴ� ��");
		
	}
}

