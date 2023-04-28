package day02;

public class Ex04 {
	public static void main(String[] args) {
		final int NUM = 100; 
		// final : 상수화(고정 해야하는 값) - 변수명을 주로 대문자로만 만든다
		System.out.println(NUM);
		
		String name = "홍길동";
		System.out.println(name);
		
		final String KOREA = "대한민국";
		System.out.println(KOREA);
		
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
		String addr;
		addr = "산골짜기";
		System.out.println(addr);
		
		int n1, n2, sum;
		n1 = 10;
		n2 = 20;
		sum = n1 + n2;
		System.out.println(sum);
		System.out.println(n1+n2);
		
		int num1=0;
		System.out.println(num1);
		String a = null;
		System.out.println(a);
		// 타입형태의 첫 문자가 대문자이면 무조건 null, 소문자이면 0으로 초기화를 시켜줘야한다.
	}
}
