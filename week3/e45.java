package week3;

public class e45 {
	public static int greatest(int number1, int number2, int number3) {
	    // write your code here
		return Math.max(number1, number2);
	}

	public static void main(String[] args) {
	    int answer =  greatest(2, 7, 3);
	    System.out.println("Greatest: " + answer);
	}
}
