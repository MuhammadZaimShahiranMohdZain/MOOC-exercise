package week2;

import java.util.Scanner;

public class e34 {
	e34(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int last = Integer.parseInt(reader.nextLine());
		int factorial = 1;
		for (int i = 1; i <= last; i++) {
			factorial*=i;
		}
		System.out.println("Factorial is "+factorial);
	}
}
