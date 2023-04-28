package day08_test04;

import java.util.Scanner;

public class MethodClass01 {
	public int myInput() {
		Scanner input = new Scanner(System.in);
		int n1;
		System.out.print("수 입력 : ");
		n1 = input.nextInt();
		return n1;
	}
	
	public int myPrime(int n) {
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n%i == 0) {
				return 0;
			}
		}
		return 1;
	}
	
	public boolean myPrime2(int n) {
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void myOutput(int n, int n2) {
		if(n2==1) {
			System.out.println(n+" => 소수입니다.");
		}else {
			System.out.println(n+" => 소수가 아닙니다.");
		}
	}
	
	public void myOutput2(boolean b, int n) {
		if(b) {
			System.out.println(n+" => 소수입니다.");
		}else {
			System.out.println(n+" => 소수가 아닙니다.");
		}
	}
	
}
