package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class e58 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		System.out.print("Type a word: ");
		String text = reader.nextLine();
		while(!words.contains(text)) {
			words.add(text);
			System.out.print("Type a word: ");
			text = reader.nextLine();
		}
		System.out.println("You have the word "+text+" twice");
	}
}
