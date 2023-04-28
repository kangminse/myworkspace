package quzi;

import java.util.HashMap;
import java.util.Scanner;

public class Win10Main {
	public static void main(String[] args) {
		Win10Service win_ser = new Win10Service();
		Scanner input = new Scanner(System.in);
		HashMap<String, String> info = new HashMap<>();
		
		String calc = "calc", notepad = "notepad";
		String msg = null;
		
		System.out.println("1.성능");
		System.out.println("2.기능사용");
		System.out.print("항목을 선택해주세요 : ");
		int num;
		num = input.nextInt();
		
		switch(num) {
		case 1:
			win_ser.display();
			break;
		case 2:
			win_ser.use(calc, notepad, msg);
			break;
		}

	}

}
