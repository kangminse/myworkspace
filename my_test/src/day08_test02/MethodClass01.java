package day08_test02;

import java.util.Scanner;

public class MethodClass01 {
	public int myInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int n = input.nextInt();
		return n;
	}
	
	public int myAs(int n) {
		int t;
		if(n%2==0) {
			t=1;
		}else {
			t=2;
		}
		return t;
	}
	
	public void myOutput(int t, int n) {
		if(t==1) {
			System.out.println(n+" => 짝입니다.");
		}else {
			System.out.println(n+" => 홀입니다.");
		}
	}
	
}


