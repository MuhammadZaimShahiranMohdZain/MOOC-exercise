package week1;

import java.util.Scanner;

public class e9 {
	e9(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		double x=Double.parseDouble(reader.nextLine());
		System.out.println();
		System.out.print("Type another number: ");
		x/=Integer.parseInt(reader.nextLine());
		System.out.println();
		System.out.println("Division: "+x);
	}
}
