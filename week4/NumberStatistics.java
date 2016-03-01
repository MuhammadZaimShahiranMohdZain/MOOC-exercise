package week4;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    private int even;
    private int odd;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
    	amountOfNumbers++;
    	sum += number;
    	if(number %2 == 0)	even += number;
    	else				odd += number;
    }
    
    public int sum() {
    	return sum;
    }

    public int sumEven(){
    	return even;
    }
    
    public int sumOdd(){
    	return odd;
    }
    public double average() {
        // code here
    	return (double)sum/amountOfNumbers;
    }
    
    public int amountOfNumbers() {
		return amountOfNumbers;
    }
}