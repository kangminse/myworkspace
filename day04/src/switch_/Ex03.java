package switch_;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		
		while(true) {
			System.out.print("이름 입력 : ");
			name = input.next();
			System.out.println("당신 이름 : "+name);
		}
		
	}
}
