package week1;

import java.util.Scanner;

public class e17 {
	e17(){
		Scanner reader = new Scanner(System.in);
		int first = 0;
		int second = 0;
		while (true) {
			System.out.println("Type the first number: ");
			first = Integer.parseInt(reader.nextLine());
			System.out.println("Type the second number: ");
			second = Integer.parseInt(reader.nextLine());
			if (first>second) 	System.out.println("\nGreater number: "+first);				
			else if (first<second) 	System.out.println("\nGreater number: "+second);		
			else System.out.println("The numbers are equal!");
		}
	}
}
