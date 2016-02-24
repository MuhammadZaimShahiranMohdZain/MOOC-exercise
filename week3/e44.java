package week3;

public class e44 {
	public static int least(int number1, int number2) {
		// write program code here
		// do not print anything inside the method
		// method needs a return in the end
		return Math.min(number1, number2);
	}

	public static void main(String[] args) {
		int answer =  least(2, 7);
		System.out.println("Least: " + answer);
	}

}
