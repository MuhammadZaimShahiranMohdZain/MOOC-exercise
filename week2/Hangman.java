package week2;

import java.util.ArrayList;

public class Hangman {
	private String word = "mooc";
//	private char[] unused = new char[26];
	private ArrayList<Character> unused = new ArrayList<>(26);
	private String voidWord;
	private char alphabet = 'a';
	private String guess = "";
	private int guesses = 0;
	private static int trial = 0;
	private static boolean progress = true;

	public Hangman() {
		// TODO Auto-generated constructor stub
		for(char temp:word.toCharArray())
			guess = guess + "?";
		for (int i = 0; i < 26; i++) 
			unused.add(alphabet++);
	}

	boolean gameOn(){
		return progress;
	}

	void printStatus(){
		if(guesses==0)
			System.out.println("You have not made any guesses yet.");
		System.out.print("Unused letters: ");
		System.out.println(unused);
	}

	void printWord(String command){
		
		System.out.println("Word to be guessed: " + guess);
	}

	/*change the guess character that had been guessed*/
	
	void guess(String command){
		guesses++;
		
		if(word.contains(command)){
			for (int i = 0; i < word.length(); i++) {
				if(word.charAt(i)==command.charAt(0))
					System.out.println(guess);
			}
		}
		else
			printMan();
		printWord(command);
	}
	void printMan(){
		/*noose*/
		trial++;
		if(trial == 1)
			System.out.println(	"\n	____________"
					+ 			"\n	     |"
					+ 			"\n	     |"
					+ 			"\n	    ( )"
					+ 			"\n"
					+ 			"\n"
					+ 			"\n"
					+ 			"\n	=============");
		else if(trial == 2)
			System.out.println(	"\n	____________"
					+ 			"\n	   |"
					+ 			"\n	   |  (-.-)"
					+ 			"\n	  ( )   |"
					+ 			"\n	       /|\\"
					+ 			"\n	        |"
					+ 			"\n	       / \\"
					+ 			"\n	=============");
		else if(trial == 3)
			System.out.println(	"\n	____________"
					+ 			"\n	     |"
					+ 			"\n	   (o.o)"
					+ 			"\n	     |"
					+ 			"\n	    /|\\"
					+ 			"\n	     |"
					+ 			"\n	    / \\"
					+ 			"\n	=============");
		else if(trial == 4){
			System.out.println(	"\n	____________"
					+ 			"\n	     |"
					+ 			"\n	     |"
					+ 			"\n	   (*.*)"
					+ 			"\n	     |"
					+ 			"\n	    /|\\"
					+ 			"\n	     |"
					+ 			"\n	 == / \\ ====="
					+ 			"\n The man is hanged!");
			progress = false;
		}
	}
}
