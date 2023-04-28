package inheritance;

import java.util.ArrayList;

class A03{
	private ArrayList<String> arr;

	public ArrayList<String> getArr() {
		return arr;
	}

	public void setArr(ArrayList<String> arr) {
		this.arr = arr;
	}
	
	public A03() {
		arr = new ArrayList<>();
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		A03 a = new A03();
		ArrayList<String> arr = a.getArr();
		arr.add("1111");
		System.out.println(arr.get(0));
		
		
	}
}
