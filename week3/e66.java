package week3;

import java.util.ArrayList;

public class e66 {
	public static int greatest(ArrayList<Integer> list) {
		// write your code here
		int max = 0;
		for (int i:list)
			if (i>max)	max = i;
		
		return max;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The greatest number is: " + greatest(list));
	}
}
