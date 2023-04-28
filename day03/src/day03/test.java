package day03;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int a = input.nextInt();
		
		String s = (a%2==0)?"짝수":"홀수";
		System.out.println(a+" = "+s);
		
		String x = (a%3==0)?"3의 배수다":"3의 배수가 아니다";
		System.out.println(a+" = "+x);
		
		System.out.print("두 수 입력 : ");
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("num1 : "+b+" ,num2 : "+c);
		
		String y = (c>b)?"num2가 num1보다 크다":"num2가 num1보다 작다";
		System.out.println(y);
		
		
		
	}
}





