package day04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num =input.nextInt();
		if(num>100) {
			System.out.println(num +" : 100보다 크다.");
		}else if (num > 50) {
			System.out.println(num +" : 50보다 크다.");
		}else {
			System.out.println(num+ " : 50 보다 작은 값들");
		}
		
		
	}
}
