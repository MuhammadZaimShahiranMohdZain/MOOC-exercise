package week3;

import java.util.ArrayList;

public class e63 {
	
	public static int sum(ArrayList<Integer> list) {
	    // write your code here
		int count = 0;
		int sum = 0;
		while(count < list.size()){
			sum += list.get(count);
			count++;
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The sum: " + sum(list));

		list.add(10);

		System.out.println("the sum: " + sum(list));
	}
}
