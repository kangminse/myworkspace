package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> listName = new ArrayList<>();
		ArrayList<String> listNumber = new ArrayList<>();
		
		int num;		//항목
		String name;	//이름
		String number;	//연락처
		String del;		//삭제할 연락처
		boolean bool = true;
		while(bool) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			
			switch(num) {
			case 1: 
				System.out.print("이름을 입력해주세요 : ");
				name = input.next();
				if(!listName.contains(name)) {
					System.out.println("추가!!");
					listName.add(name);
					
				}
				else {
					System.out.println("중복된 이름입니다.");
					continue;
				}
				
				
				System.out.print("연락처를 입력해주세요 : ");
				number = input.next();
				if(!listNumber.contains(number)) {
					System.out.println("추가!!");
					listNumber.add(number);
				}
				else {
					System.out.println("중복된 연락처입니다.");
					continue;
				}
				break;
				
			case 2:
				if(listName.size()==0) {
					System.out.println("목록에 없습니다.");
					continue;
				}
				for(int i=0; i<listName.size(); i++) {
					System.out.println("이름 : " + listName.get(i) + " 연락처 : " + listNumber.get(i));
				}
				break;
				
			case 3:
				if(listName.size()==0) {
					System.out.println("목록에 없습니다.");
					continue;
				}
				
				System.out.print("삭제할 연락처를 입력해주세요 : ");
				del = input.next();
				int delNumber = listNumber.indexOf(del);
				System.out.println(del+"와 같은 연락처가 삭제되었습니다!");
				listName.remove(delNumber);
				listNumber.remove(delNumber);
				
				
				break;
			case 4:
				for(int i=0; i<listName.size(); i++) {
					System.out.println("이름 : " + listName.get(i) + " 연락처 : " + listNumber.get(i));
				}
				break;
				
			case 5:
				bool = false;
				break;
			
				
				
			}
			
		} 
	}
}


