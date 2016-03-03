package week4;

import java.util.Random;

public class PasswordRandomizer {
	private int length;
	private Random random;
	private String password;
	public PasswordRandomizer(int length) {
		this.length = length;
		random = new Random();
	}

	public String createPassword() {
		password = "";
		String symbol = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < length; i++) {
			password = password + symbol.charAt(random.nextInt(25));			
		}
		return password;
	}
}