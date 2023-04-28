package switch_;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cnt = 0;
		String home = null;
		String com = null;
		
		
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.print("원하는 항목을 선택해주세요 : ");
			cnt = input.nextInt();
			
			
			if (cnt == 1) {System.out.print("주소를 입력해주세요 : "); home = input.next(); System.out.println("");}
			if (cnt == 2) {System.out.print("회사 이름을 입력해주세요 : "); com = input.next(); System.out.println("");}
			if (cnt == 3) {
				System.out.println("우리집 : " + home);
				System.out.println("회사 : " + com);
				System.out.println("등록이 완료되었습니다!!");
				break;
			}
		}//while
	}//main
}//switch
