package constructor;

/*
 constructor(생성자)
 - 초기화 목적
 - 객체를 생성할 때 자동으로 호출된다.
 - 클래스 이름과 동일한 메소드 이름을 가지며 변환 타입, 값은 없다.
 */

class TestClass01{
	private int age;
	public TestClass01(int age){
		System.out.println(age + " : 생성자 호출");
		this.age = age;
	}
	
	public TestClass01() {
		System.out.println("기본생성자");
	}
	
	public TestClass01(int a, int b) {
		System.out.println("2개 받아줌");
	}
	
	public void test() {
		System.out.println("test");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(100);
		TestClass01 t2 = new TestClass01();
		TestClass01 t3 = new TestClass01(10, 20);
		String s = new String();
	}

}
