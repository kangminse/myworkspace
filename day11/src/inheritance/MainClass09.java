package inheritance;

/*
 protected : public과 private의 중간 => 외부의 접근은 불가능하지만 자식에게는 허용된다
 private < default < protected < public
 super.변수 : 부모 클래스에에 있는 변수
 this.변수 : 자신의 클래스에 있는 변수
 */

class A09{
	protected int num = 100;
	String s = "부모";
}

class B09 extends A09{
	String s = "자식";
	public void test() {
		System.out.println(num);
		System.out.println(super.s);
		System.out.println(this.s);
		System.out.println(s);
	}
}

public class MainClass09 {
	public static void main(String[] args) {
		B09 b = new B09();
		b.test();

	}

}
