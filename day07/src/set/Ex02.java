package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		Iterator<String> it = arr.iterator(); // 반복자 생성
		/*
		System.out.println(it.hasNext()); 
		//hasNext : 다음 위치에 값이 있는지만 확인하는 것(true, false), 실제로 이동하지는 않음
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		// next : 다음 위치로 이동하는 것, 다음 값이 없을때 사용하면 에러가 발생함
		System.out.println(it.hasNext()); 
		*/
		for(String s : arr) {
			System.out.println(it.next());
		}
		/*
		 for( ; it.hasNext() ; ) { //it.hasNext() == true
		 	System.out.println( it.next() );
		 }
		 */
		
		HashSet<String> set = new HashSet<>();
		set.add("set aaa");
		set.add("set bbb");
		set.add("set ccc");
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
