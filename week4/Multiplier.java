package week4;

public class Multiplier {
	int number;
	
	Multiplier(int number){
		this.number = number;
	}
	
	public int multiply(int otherNumber){
		otherNumber *= this.number;
		return otherNumber;
	}
}
