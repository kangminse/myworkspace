package day02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		double dou;
		String str;
		
		System.out.print("수 입력 : " );
		n = input.nextInt();
		System.out.println("입력한 수 : " + n);
		System.out.println();
		
		System.out.print("실수 입력 : ");
		dou = input.nextDouble();
		System.out.println("입력한 수 : " + dou);
		System.out.println();
		
		System.out.print("글자 입력 : ");
		str = input.next();
		System.out.println("입력한 글자 : " + str);
		
	}
}
