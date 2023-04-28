package while_;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 break : switch 또는 반복문을 빠져나올때 사용(switch, 반복문에만 사용가능)
		 continue : 반복문의 위로 이동
		*/
		int i=1;
		while(true) {
			System.out.println(i++);
			if(i==5) {
				break;
			}
		}
		System.out.println("다음 문장들 실행~~");
		
		for(int j=1; j<=5; j++) {
			if(j==3) {
				System.out.println("33333333");
				continue;
			}
			System.out.println(j);
		}
		System.out.println("다음 문장들 실행~~");
		
		
	}
}



