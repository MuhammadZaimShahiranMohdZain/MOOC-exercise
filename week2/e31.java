package week2;

import java.util.Scanner;

public class e31 {
	e31(){
		Scanner reader = new Scanner(System.in);
		System.out.print("First: ");
		int first = Integer.parseInt(reader.nextLine());
		System.out.print("Last: ");
		int last = Integer.parseInt(reader.nextLine());
		for (int i = first; i <= last; i++) {
			System.out.println(i);
		}
	}
}
