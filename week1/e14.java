package week1;

import java.util.Scanner;

public class e14 {
	e14(){
		Scanner reader = new Scanner(System.in);
		String x="";
		System.out.println("Type a number: ");
		int check = Integer.parseInt(reader.nextLine());
		
		if(check<0)
			x="not ";
		
		System.out.println("The number is " + x + "positive.");
	}
}
