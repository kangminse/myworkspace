package object;

import java.util.ArrayList;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.test1(1);
		t.test2(1);
		
		ArrayList<String> arr = new ArrayList<>();
		boolean bo = arr.add("aaa");
		
		boolean bool = t.test3();
	}
}
