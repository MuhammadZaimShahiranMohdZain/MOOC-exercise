package week3;

import java.util.Scanner;

public class e56 {
	public static String reverse(String text) {
		// write your code here
		String help = "";
		int count = text.length();
		for (int i = text.length()-1; i >= 0; i--) {
			help = help + text.charAt(i);
		}
		return help;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in your text: ");
		String text = reader.nextLine();
		System.out.println("In reverse order: " + reverse(text));
	}
}
