package day04;

import java.util.Scanner;

//switch
public class Ex02 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int select;
		String bane;
		System.out.println(" 수 입력 ");	
		select =input.nextInt();
		System.out.println("문자 입력");
		bane=input.next();
		System.out.println(bane);
		switch(select) {
		case 1: System.out.println("1.입력값 :"+select); break;
		case 2: System.out.println("2.입력값 :"+select); break;
		case 3: System.out.println("3.입력값 :"+select); break;
		default: System.out.println("1,2,3을 제외한 다른 값 입력");
		}
				
	}
}
