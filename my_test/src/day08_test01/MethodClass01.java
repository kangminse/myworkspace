package day08_test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MethodClass01 {
	public String[] myInput() {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		
		System.out.print("이름 입력 : ");
		n1 = input.next();
		System.out.print("이름 입력 : ");
		n2 = input.next();
		
		String[] name = {n1, n2};
		return name;
	}
	
	public ArrayList<String> myArr() {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		String n1, n2;
		
		System.out.print("이름 이력 : ");
		n1 = input.next();
		System.out.print("이름 이력 : ");
		n2 = input.next();
		
		arr.add(n1);
		arr.add(n2);
		return arr;
	}
	
	public HashMap<Integer, String> myHash(){
		Scanner input = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		String n1, n2;
		
		System.out.print("이름 이력 : ");
		n1 = input.next();
		System.out.print("이름 이력 : ");
		n2 = input.next();
		
		map.put(1, n1);
		map.put(2, n2);
		return map;
	}
	
	public void myOutput(String[] n) {
		System.out.println(n[0] + " " + n[1]);
	}
	public void myArrout(ArrayList<String> n) {
		System.out.println(n);
	}
	public void myHashout(HashMap<Integer, String> n) {
		System.out.println(n);
	}
	
}
