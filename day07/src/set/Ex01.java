package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 set
		 - 순서가 존재하지 않는다. (랜덤으로 초기화)
		 - 데이터의 중복을 허용하지 않는다. (중복된 데이터를 삭제함)
		 - 배열 안의 공간을 16개 잡고 75%가 차면 새롭게 16개의 공간을 생성한다. 공간은 유동적이다.
		 */
		
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("aaa");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("aaa");
		
		System.out.println("set : " + set);
		System.out.println("arr : " + arr);
		
		System.out.println("==== remove ====");
		set.remove("bbb");
		System.out.println(set);
		
		
	}
}



