package week1;

import java.util.Scanner;

public class e15 {
	e15(){
		Scanner reader = new Scanner(System.in);
		int age=0;
		String x;
		while (true) {
			x="";
			System.out.println("How old are you? ");
			age = Integer.parseInt(reader.nextLine());
			if(age<18)
				x="not ";
			System.out.println("You have "+x+"reached the age of maturity");
		}
		
	}
}
