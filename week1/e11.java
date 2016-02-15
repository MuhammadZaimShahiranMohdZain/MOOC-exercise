package week1;

import java.util.Scanner;

public class e11 {
	e11(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		System.out.println("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		if (num1>num2) 
			System.out.println("The bigger number of the two numbers given was: "+ num1);			
		else if(num2>num1)
			System.out.println("The bigger number of the two numbers given was: "+ num2);
	}
}
