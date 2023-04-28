package switch_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String msg = null;
		System.out.print("문자열 입력 : ");
		msg = input.next();
		switch(msg) {
		case "안녕" : System.out.println("하세요");break;
		case "그래" : System.out.println("반갑다");break;
		}
		System.out.println("다음 문장들 실행!!");
		
		
		
		
	}
}
