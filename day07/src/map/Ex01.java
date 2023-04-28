package map;

import java.util.HashMap;

public class Ex01 {
/*
 HashMap
 - 키, 값으로 이루어져 있다.
 - 순서는 유지되지 않는다.
 - 키의 중복은 허용되지 않는다. 값은 중복 가능
 */
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		HashMap<String, Integer> map3 = new HashMap<>();
		
		map1.put("name", "홍길동"); // name이라는 키에 홍길동이라는 값을 넣는다
		map1.put("age", "20");
		map1.put("addr", "산골짜기");
		
		System.out.println(map1);
		System.out.println(map1.get("name"));
		
		map2.put(1, "일");
		map2.put(22, "이이");
		map2.put(333, "삼삼삼");
		
		System.out.println(map2);
		System.out.println(map2.get(1));
		System.out.println(map2.get(2)); // 없는 키를 넣으면 null이라고 출력됌
		
	}
}




