package day04;

import java.util.Scanner;

//switch
public class Ex02 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int select;
		String bane;
		System.out.println(" �� �Է� ");	
		select =input.nextInt();
		System.out.println("���� �Է�");
		bane=input.next();
		System.out.println(bane);
		switch(select) {
		case 1: System.out.println("1.�Է°� :"+select); break;
		case 2: System.out.println("2.�Է°� :"+select); break;
		case 3: System.out.println("3.�Է°� :"+select); break;
		default: System.out.println("1,2,3�� ������ �ٸ� �� �Է�");
		}
				
	}
}
