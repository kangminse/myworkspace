package day02;

public class Ex03 {
	public static void main(String[] args) {
		char ch = 'a';
		int num = 65;
		System.out.println( num );
		System.out.println( ch );
		char ch02 = (char)num; // 강제 형 변환
		int num02 = ch; // 자동 형 변환
		
		System.out.println( num02 );
		System.out.println( ch02 );
	}

}
