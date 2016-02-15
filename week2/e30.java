package week2;

import java.util.Scanner;

public class e30 {
	e30(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Up to what number? ");
		int num = Integer.parseInt(reader.nextLine());
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
