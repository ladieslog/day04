package day04;

import java.util.Scanner;

public class Quiz02_t2 {
	public static void main(String[] args) {
		Scanner pulls = new Scanner(System.in);
		int a;
		String l="", k="";
		while(true) {
			System.out.println("번호를 눌러주세요 : \n 1.우리집등록\n "+
					"2.회사 등록 \n 3.등록 보기");
				a=pulls.nextInt();
			
				if(a==1) {
					System.out.print("우리집 목적지 입력 : ");
					l=pulls.next();
				}else if(a==2){
					System.out.print("회사 목적지 입력 : ");
					k =pulls.next();
				}else if(a==3) {
					System.out.println("우리집 :"+  l+"\n 회사 :"+ k);
				}
		}	
	}
}
