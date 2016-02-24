package week3;

import java.util.Scanner;

public class e53 {
	public static String substring(String text,int length){
		return text.substring(0, length);
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a word: ");
		String text = reader.nextLine();
		System.out.println("Length of the first part: ");
		int length = Integer.parseInt(reader.nextLine());
		System.out.println("Result: "+substring(text,length));
	}
}
