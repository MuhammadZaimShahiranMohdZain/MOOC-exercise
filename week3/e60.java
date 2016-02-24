package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class e60 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		String text;
		do {
			System.out.println("Type a word: ");
			text = reader.nextLine();
			words.add(text);		
		}while(!text.isEmpty());
		System.out.println("You typed the following words:");
		words.sort(null);
		for(String print:words){
			System.out.println(print);
		}
	}
}
