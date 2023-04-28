package switch_;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day = 0;
		
		while(true) {
			System.out.print("날짜 입력 : ");
			day = input.nextInt();
			if (day % 7 == 1) System.out.println("월");
			else if(day % 7 == 2) System.out.println("화");
			else if(day % 7 == 3) System.out.println("수");
			else if(day % 7 == 4) System.out.println("목");
			else if(day % 7 == 5) System.out.println("금");
			else if(day % 7 == 6) System.out.println("토");
			else if(day % 7 == 0) System.out.println("일");
	}//while
}//main
}//class