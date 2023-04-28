package map;

import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("선풍기", "100만원");
		map.put("에어컨", "50만원");
		map.put("자동차", "10만원");
		
		System.out.println(map);
		System.out.println("결과 : "+map.containsKey("자동차"));
		System.out.println("결과 : "+map.containsValue("50만원"));
		// key나 value로 값을 찾아 true / false로 출력
		
		map.put("선풍기1", "100만원");
		map.put("자동차", "1000만원");
		System.out.println(map);
		
		map.remove("선풍기1"); // 삭제하고자하는 값의 키를 넣어줌
		System.out.println(map);
		
	}
}



