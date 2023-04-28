package day08_test04;

public class MainClass01 {
	public static void main(String[] args) {
		MethodClass01 m = new MethodClass01();
		
		int num = m.myInput();
		int num2 = m.myPrime(num);
		m.myOutput(num, num2);
		
		int num3 = m.myInput();
		boolean bool = m.myPrime2(num3);
		m.myOutput2(bool, num3);
	}
}
