package random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<6; i++) {
			double ran2 = Math.random()*10+1;
			
			if(!arr.contains((int)ran2)) {
				arr.add((int)ran2);
			}else {
				i--;
			}
		}
		
		while(set.size()<6) {
			double ran = Math.random()*10+1;
			set.add((int)(ran));
		}
		System.out.println(arr);
		System.out.println(set);
		
	}
}
