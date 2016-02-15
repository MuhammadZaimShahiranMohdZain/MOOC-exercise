package week2;

import java.util.Scanner;

public class e25 {
	e25(){
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Type the first number: ");
		sum += Integer.parseInt(reader.nextLine());
		System.out.println("Type the second number: ");
		sum += Integer.parseInt(reader.nextLine());
		System.out.println("Type the third number: ");
		sum += Integer.parseInt(reader.nextLine());
		
		System.out.println("\nSum: "+sum);
	}
}
