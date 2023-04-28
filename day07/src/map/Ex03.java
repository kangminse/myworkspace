package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("addr", "산골짜기");
		
		System.out.println(map.keySet()); // keySet : 키들만 출력함
		System.out.println(map.values()); // values : 값들만 출력함
		
		Set<String> key_set = map.keySet();
		Collection<String> value_co = map.values();
		
		System.out.println(key_set);
		System.out.println(value_co);
		
		Iterator<String> keyIt = key_set.iterator();
		Iterator<String> valueIt = value_co.iterator();
		
		while(keyIt.hasNext()) {
			String k = keyIt.next();
			String v = valueIt.next();
			System.out.println(k + " : "+v);
			
			
		}
	}
}



