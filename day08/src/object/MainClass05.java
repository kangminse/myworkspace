package object;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Scanner input = new Scanner(System.in);	
		int num = 0, sum = 0;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		TestClass05 t = new TestClass05();
		sum = t.sumFunc(num); 
		// parameter : 메소드에 넣어주는 값 (인자값)
		// sum : return 받은 값을 sum에 저장해준다.
		
		System.out.println("1~"+num+"까지의 합 : "+sum);
		
		System.out.println("main end");
		
	}
}
