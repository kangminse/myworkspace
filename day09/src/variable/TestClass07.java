package variable;

import java.util.Scanner;

public class TestClass07 {
	private int age;
	private String name;
	
	public void myInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("나이 입력 : ");
		age = input.nextInt();
	}
	
	public void cal() {
		age = age-1;
	}
	
	public void display() {
		System.out.println("이름 : " + name);
		
		System.out.println("만 나이 : " + age);
		/*
		 입력, 출력, 만으로 연산하는 각각의 기능을 만드세요
		 변수는 인스턴스 변수로 변경하여 사용하세요
		 */
	}
}
