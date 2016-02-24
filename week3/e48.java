package week3;

import java.util.Scanner;

public class e48 {
	public static char firstCharacters(String text){
		return text.charAt(0);
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your name: ");
		String text = reader.nextLine();
		System.out.println("Number of characters: " + firstCharacters(text));
	}
}
