package day04;

import java.util.Scanner;

public class Quiz01_5 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a,b,c=0,sum=0;
		System.out.print(" ¥��� �׸� ���� �Է� ���ּ���: ");
		a =pulls.nextInt();
		System.out.print(" «�� �׸� ���� �Է� ���ּ���: ");
		b =pulls.nextInt();
		sum= a*5000 + b*6000;
		if ((a+b)>=10) {
			c=sum/10;
			sum -=c;
		}
		else if ((a+b)>=5) {
			c=sum/20;
			sum-=c;
		}
		System.out.println("����� ����� �ݾ��� :"+sum);
		
	}
}
