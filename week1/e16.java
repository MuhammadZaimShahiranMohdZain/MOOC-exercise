package week1;

import java.util.Scanner;

public class e16 {
	e16(){
		Scanner reader = new Scanner(System.in);
		String check = "even";
		int num = 0;
		while (true) {
			System.out.println("Type a number: ");
			num = Integer.parseInt(reader.nextLine());			
			if (num%2!=0) 	check = "odd";
			else			check = "even";
			System.out.println("Number "+num+" is "+check);
		}
	}
}
