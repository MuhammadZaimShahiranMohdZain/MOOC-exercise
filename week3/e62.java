package week3;

import java.util.ArrayList;
import java.util.Collections;

public class e62 {
	
	public static void removeLast(ArrayList<String> list){
		list.remove(list.size()-1);
	}
	
	public static void main(String[] args) {
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		System.out.println("brothers:");
		System.out.println(brothers);

		// sorting brothers
		brothers.sort(null);
//		Collections.sort(brothers);
		
		// removing the last item
		removeLast(brothers);

		System.out.println(brothers);
	}
}
