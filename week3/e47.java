package week3;

import java.util.Scanner;

public class e47 {
	public static int calculateCharacters(String text){
		return text.length();
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your name: ");
		String text = reader.nextLine();
		System.out.println("Number of characters: " + calculateCharacters(text));
	}
}
