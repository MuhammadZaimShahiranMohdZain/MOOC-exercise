package week3;

import java.util.ArrayList;

public class e65 {
	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		// write your code here
		ArrayList<Integer> length = new ArrayList<>();
		
		for(String temp:list){
			length.add(temp.length());
		}
		return length;
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Moi");
		list.add("Benvenuto!");
		list.add("badger badger badger badger");
		ArrayList<Integer> lengths = lengths(list);

		System.out.println("The lengths of the Strings: " + lengths);
	}
}
