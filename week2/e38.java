package week2;

import java.util.Scanner;

public class e38 {
	e38(){
		Scanner reader = new Scanner(System.in);
		System.out.print("How many times: ");
		int repeat = Integer.parseInt(reader.nextLine());
		int count=1;
		while(count <= repeat){
			printText();
			count++;
		}
	}
	public static void printText(){
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
}
