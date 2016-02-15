package week2;

import java.util.Scanner;

public class e36 {
	e36(){
		Scanner reader = new Scanner(System.in);
		int number;
		int sum = 0;
		int count = 0;
		int even = 0;
		int odd = 0;
		System.out.println("Type numbers: ");
		while(true){
			number = Integer.parseInt(reader.nextLine());
			if(number == -1) break;
			if(number%2==0) even++;
			else odd++;
			sum+=number;
			count++;
		}
		double avg = (double)sum/count;
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is "+sum);
		System.out.println("How many numbers: "+count);
		System.out.println("Average: "+avg);
		System.out.println("Even numbers: "+even);
		System.out.println("Odd numbers: "+odd);
	}
}
