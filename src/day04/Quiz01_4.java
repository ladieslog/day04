package day04;

import java.util.Scanner;

public class Quiz01_4 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a;
		System.out.println(" ���̸� �Է����ּ��� ");
		a=pulls.nextInt();
		if(a<8)
			System.out.println("�Ƶ��Դϴ�. ������ 500�� �Դϴ�.");
		else if(a<14)
			System.out.println("�ʵ��л��Դϴ�. ������ 1000���Դϴ�.");
		else if(a<20)
			System.out.println("û�ҳ��Դϴ�. ������ 1500���Դϴ�.");
		
	}
}
