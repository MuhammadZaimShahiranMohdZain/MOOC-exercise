package week4;

import java.util.stream.IntStream;

public class HangmanLogic {
	private String word;
	private String guessedLetters;
	private int numberOfFaults;

	public HangmanLogic(String word) {
		this.word = word.toUpperCase();
		this.guessedLetters = "";
		this.numberOfFaults = 0;
	}

	public int numberOfFaults() {
		return this.numberOfFaults;
	}

	public String guessedLetters() {
		return this.guessedLetters;
	}

	public int losingFaultAmount() {
		return 12;
	}

	public void guessLetter(String letter) {
		// program here the functionality for making a guess

		// if the letter has already been guessed, nothing happens
		if(guessedLetters.contains(letter))
			System.out.println(letter + " is already guessed before. Guess another one.");

		// it the word does not contains the guessed letter, the number of faults increases
		// the letter is added among the already guessed letters
		else if(!guessedLetters.contains(letter)){
			if(!word.contains(letter))
				numberOfFaults++;
			else if(word.contains(letter)){

			}
			guessedLetters += letter;
		}
	}

	public String hiddenWord() {
		char[] value = new char[word.length()];
		String hidden = new String(value);
		// program here the functionality for building the hidden word

		// create the hidden word by iterating through this.word letter by letter
		for (int i = 0; i < word.length(); i++) {
//			hidden += "_";
		}
		// if the letter in turn is within the guessed words, put it in the hidden word
		// if the letter is not among the guessed ones, replace it with _ in the hidden word

		// return the hidden word at the end

		return hidden;
	}
}
