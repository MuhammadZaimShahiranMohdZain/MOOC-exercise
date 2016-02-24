package week3;

import java.util.Scanner;

public class e50 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your name: ");
		String text = reader.nextLine();
		if(text.length()>=3)
			for (int i = 0; i < 3; i++) {			
				System.out.println((i+1)+". character: "+text.charAt(i));
			}
	}
}
