package day04;

import java.util.Scanner;

public class Quiz02_t2 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a;
		String l="", k="";
		while(true) {
			System.out.println("��ȣ�� �����ּ��� : \n 1.�츮�����\n "+
					"2.ȸ�� ��� \n 3.��� ����");
				a=pulls.nextInt();
			
				if(a==1) {
					System.out.print("�츮�� ������ �Է� : ");
					l=pulls.next();
				}else if(a==2){
					System.out.print("ȸ�� ������ �Է� : ");
					k =pulls.next();
				}else if(a==3) {
					System.out.println("�츮�� :"+  l+"\n ȸ�� :"+ k);
				}
		}	
	}
}
