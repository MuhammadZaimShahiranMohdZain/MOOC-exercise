package week5;

public class e84 {
public static void main(String[] args) {
	Counter counter1 = new Counter();
	Counter counter2 = new Counter(false);
	Counter counter3 = new Counter(11);
	
	counter1.decrease();
	System.out.println(counter1.getStartingValue());
	System.out.println(counter2.getStartingValue());
	System.out.println(counter3.getStartingValue());
}
}
