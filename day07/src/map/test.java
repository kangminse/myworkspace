package map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		boolean bool = true;
		int num; // 항목번호
		int modi; //메뉴별 가격보기에서 항목번호
		String menu; // 음식이름
		String price; //음식가격
		String modi_menu = null; //수정할 음식이름
		String modi_price = null; //수정할 음식가격
		
		while(bool){
			System.out.println("===========");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			System.out.println("===========");
			int cnt = 1; // 음식개수
			
			
			switch(num) {
			case 1:
				System.out.print("음식 이름을 입력해주세요 : ");
				menu = input.next();
				System.out.print("음식 가격을 입력해주세요 : ");
				price = input.next();
				map.put(menu, price);
				
				break;
				
			case 2:
				Iterator<String> it = map.keySet().iterator();
				
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(cnt+"."+key+" : "+map.get(key));
					cnt+=1;
				}
				
				System.out.println("1.수정  2.삭제  3.나가기");
				System.out.print(">>> ");
				modi = input.nextInt();
				
				if(modi==1) {
					System.out.print("수정할 음식 이름을 입력해주세요 : ");
					modi_menu = input.next();
					System.out.print("수정할 음식 가격을 입력해주세요 : ");
					modi_price = input.next();
					if(map.containsKey(modi_menu)) {
						map.replace(modi_menu, modi_price);
						}
					else {
						System.out.println(modi_menu+"란 메뉴는 존재하지 않습니다.");
					}
					
				}
				else if(modi==2){
					System.out.println("삭제할 음식 이름을 입력해주세요 : ");
					modi_menu = input.next();
					System.out.println("삭제할 음식 가격을 입력해주세요 : ");
					modi_price = input.next();
					map.remove(modi_menu, modi_price);
				}
				else if(modi==3) {
					break;
				}
				break;
				
			case 3:
				bool = false;
				break;
				
			}//switch
		}//while
	}//main
}//class
