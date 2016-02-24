package week3;

import java.util.Scanner;

public class e49 {
	public static char lastCharacters(String text){
		return text.charAt(text.length()-1);
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your name: ");
		String text = reader.nextLine();
		System.out.println("Number of characters: " + lastCharacters(text));
	}
}
