package for_;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 2 * 1 = 2
		 2 * 2 = 4
		 . . .
		 9 * 9 = 81
		 */
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
			}
			System.out.println();
		}
	}//main
}//class
