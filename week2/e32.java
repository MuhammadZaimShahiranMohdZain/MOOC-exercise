package week2;

import java.util.Scanner;

public class e32 {
	e32(){
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		System.out.print("Until what? ");
		int last = Integer.parseInt(reader.nextLine());
		for (int i = 0; i <= last; i++) {
			sum+=i;
		}
		System.out.println("Sum is "+sum);
	}
}
