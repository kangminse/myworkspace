package str;

public class Ex02 {

	public static void main(String[] args) {
		int num = 1111;
		String st = num+""; // 숫자를 문자로 형변환
		System.out.println(st+num);
		int n = Integer.parseInt(st); // 문자를 숫자로 형변환
		System.out.println(n+num);
		
		String st02 = "";
		st02 += "a";
		st02 += 'b';
		st02 += (char)('c'-32);
		System.out.println(st02);
	}
}
