package week2;

import java.util.Scanner;

public class e42 {
	public static void main(String[] args) {
		new e42();
	}
	
	e42(){
		Scanner reader = new Scanner(System.in);
		System.out.println( "****************\n"
				+ "*    Hangman   *\n"
				+ "****************\n");
		printMenu();
		Hangman hangman = new Hangman();
		
		while(hangman.gameOn()){
			System.out.println("\n===============================================================================================");
			System.out.println("\nType a command: ");
			String command = reader.nextLine();

			if(command.equals("quit")) break;
			else if(command.equals("status")) hangman.printStatus();
			else if(command.length() == 1)	    hangman.guess(command);
			else if(command.length() == 0)		printMenu();
			else							System.out.println("Please guess one letter only...\n");
		}
		
		System.out.println("\nThank you for playing!");
	}

	void printMenu(){
		System.out.println("    * menu *\n"
				+ "    --------");
		System.out.println("quit   - quits the game");
		System.out.println("status  - prints the game status");
		System.out.println("a single letter uses the letter as a guess");
		System.out.println("an empty line prints this menu");

	}
}
