package day08_test01;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass01 {
	public static void main(String[] args) {
		MethodClass01 m = new MethodClass01();
		ArrayList<String> arr = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<>();
		
		String[] name = m.myInput();
		m.myOutput(name);
		
		arr = m.myArr();
		m.myArrout(arr);
		
		map = m.myHash();
		m.myHashout(map);
		
	}//main
}//class
