package variable;

class TestClass05{
	static int num;
	static {
		num = 100;
	}
	public void test() {
		System.out.println("num : "+num);
	}
	
	static int n1 = 100;
	public static void test2() {
		System.out.println("n1 : "+n1);
	}
}

public class MainClass05 {
	static int num = 100;
	public static void main(String[] args) {
		System.out.println(num);
	}
	

}
