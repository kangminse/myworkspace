package str;

public class Ex03 {

	public static void main(String[] args) {
		String id = "test          ";
		System.out.println(id+"!");
		id = id.trim();  // 1회성 연산(공백 삭제 기능)
		System.out.println(id+"!");
		if(id.equals(id)) {
			System.out.println("인증통과");
		}else {
			System.out.println("인증실패");
		}
		
		String addr = "우편번호/주소/상세주소";
		System.out.println(addr);
		String[] s = addr.split("/");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		addr = addr.replace("/", "=>");
		System.out.println("addr : "+addr);
	}
}
