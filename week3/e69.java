package week3;

import java.util.Scanner;

public class e69 {
	public static boolean palindrome(String text) {
	    // write your code here
		String reverse = "";
		for (int i = 0; i < text.length(); i++) {
			reverse = reverse+text.charAt(text.length()-i-1);
		}
		if(reverse.equals(text))
			return true;
		return false;
	}

	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    System.out.println("Type a text: ");
	    String text = reader.nextLine();
	    if (palindrome(text)) {
	       System.out.println("The text is a palindrome!");
	    } else {
	       System.out.println("The text is not a palindrome!");
	    }
	}
}
