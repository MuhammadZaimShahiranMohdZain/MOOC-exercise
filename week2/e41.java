package week2;

import java.util.Scanner;

public class e41 {
	e41(){
		int number = (int)Math.random();
		drawNumber(number);
	}
	void drawNumber(int number){
		Scanner reader = new Scanner(System.in);
		int guess;
		int count=0;
		while(true){
			count++;
			System.out.print("\nGuess a number: ");
			guess = Integer.parseInt(reader.nextLine());
			if(guess==number) break;
			else if(guess>number) System.out.println("The number is lesser, guesses made: "+count);
			else if(guess<number) System.out.println("The number is greater, guesses made: "+count);
		}
		System.out.println("Congratulations, your guess is correct!");
	}
}
