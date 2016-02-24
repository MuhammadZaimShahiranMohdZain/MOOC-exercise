package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class e59 {
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
		for(String print:words){
			for (int i = print.length()-1; i >= 0; i--) {
				System.out.print(print.charAt(i));				
			}
		}
	}
}
