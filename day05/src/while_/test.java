package while_;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		boolean bool = false;
		System.out.print("숫자를 입력해주세요 : ");
		num=input.nextInt();
		
		for(int i=2; i<num; i++) { //소수 판별
			if(num%i==0) {bool=false;}
			else {bool=true;}
			//System.out.println(bool);
		}
		
		if(bool) System.out.println(num+"는 소수가 맞습니다!!");
		else System.out.println(num+"는 소수가 아닙니다!!");
	}
}
