package week4;

import java.util.Random;

public class Dice {
	private Random random;
	private int numberOfSides;

	public Dice(int numberOfSides){
		this.numberOfSides = numberOfSides;
		random = new Random();

	}

	public int roll() {
		int i=0;
		while(i==0)
			i = random.nextInt(numberOfSides);
		return i;
	}
}