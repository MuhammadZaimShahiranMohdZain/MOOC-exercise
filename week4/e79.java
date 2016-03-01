package week4;

import java.util.Scanner;

public class e79 {
	public static void main(String[] args) {
		NumberStatistics stats = new NumberStatistics();
		Scanner reader = new Scanner(System.in);
		System.out.println("Type numbers: ");
		int number = reader.nextInt();
		while(number != -1){
			stats.addNumber(number);
			number = reader.nextInt();
		}
		System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + stats.sumEven());
        System.out.println("sum of odd: " + stats.sumOdd());
        System.out.println("average: " + stats.average());
	}
}
