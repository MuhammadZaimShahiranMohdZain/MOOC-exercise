package week3;

import java.util.Scanner;

public class e55 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String is = "";
		System.out.println("Type the first word: ");
		String text1 = reader.nextLine();
		System.out.println("Type the second word: ");
		String text2 = reader.nextLine();
		if(text1.indexOf(text2)==-1)
			is = "not ";
		System.out.println("The word '"+text2+"' is "+is+"found in the word '"+text1+"'.");
	}
}
