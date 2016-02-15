package week2;

import java.util.Scanner;

public class e33 {
	e33(){
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		System.out.print("First: ");
		int first = Integer.parseInt(reader.nextLine());
		System.out.print("Last: ");
		int last = Integer.parseInt(reader.nextLine());
		for (int i = first; i <= last; i++) {
			sum+=i;
		}
		System.out.println("Sum is "+sum);
	}
}
