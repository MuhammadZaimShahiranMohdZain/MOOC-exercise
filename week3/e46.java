package week3;

public class e46 {
	public static double average(int number1, int number2, int number3, int number4) {
	    // write your code here
		double avg = (double)(number1 + number2)/2;
		return avg;
	}

	public static void main(String[] args) {
	    double answer = average(4, 3, 6, 1);
	    System.out.println("average: " + answer);
	}
}
