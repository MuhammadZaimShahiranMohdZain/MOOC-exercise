package week3;

import java.util.Scanner;

public class e52 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your name: ");
		String text = reader.nextLine();
		System.out.println("In reverse order: ");
		for (int i = text.length()-1; i >= 0; i--) {			
			System.out.print(text.charAt(i));
		}
	}
}
