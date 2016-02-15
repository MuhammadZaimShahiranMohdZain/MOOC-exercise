package week1;

import java.util.Scanner;

public class e21 {
	e21(){
		Scanner reader = new Scanner(System.in);
		int year = 0;
		String result;
		while(true){
			result = "not ";
			System.out.println("Type a year: ");
			year = Integer.parseInt(reader.nextLine());

			if(year%4==0){
				result = "";
				if (year%100==0&&year%400!=0)
					result = "not ";				
			}
			System.out.println("The year is " + result + "a leap year.\n");
		}
	}
}
