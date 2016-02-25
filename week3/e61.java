package week3;

import java.util.ArrayList;

public class e61 {

	public static int countItems(ArrayList<String> list){
		return list.size();
	}

	public static void print(ArrayList<String> printed) {
		for (String word : printed) {
			System.out.println( word );
		}
	}

	public static void removeFirst(ArrayList<String> list) {
		list.remove(0);  // removes the first item (indexed 0)
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Pascal");
		list.add("Java");
		list.add("Python");
		list.add("Ruby");
		list.add("C++");

		print(list);
		if(list.size()!=0)
			removeFirst(list);			

		System.out.println();

		print(list);
		//		System.out.println("There are this many items in the list:");
		//		System.out.println(countItems(list));
	}
}
