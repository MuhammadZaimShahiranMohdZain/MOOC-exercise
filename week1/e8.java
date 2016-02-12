package week1;

import java.util.Scanner;

public class e8 {
	e8(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int x=Integer.parseInt(reader.nextLine());
		System.out.println();
		System.out.print("Type another number: ");
		x+=Integer.parseInt(reader.nextLine());
		System.out.println();
		System.out.println("Sum of the numbers: "+x);
	}
}
