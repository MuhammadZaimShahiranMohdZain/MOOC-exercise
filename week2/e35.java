package week2;

import java.util.Scanner;

public class e35 {
	e35(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int power = Integer.parseInt(reader.nextLine());
		int result = 0;
		for (int i = 0; i <= power; i++) {
			result += (int)Math.pow(2, i);
		}
		System.out.println("The result is "+result);
	}
}
