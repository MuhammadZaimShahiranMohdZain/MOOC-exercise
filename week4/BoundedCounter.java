package week4;

public class BoundedCounter {
	private int value;
	private int upperLimit;

	public BoundedCounter(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public void next() {
		value++;
		if(value>upperLimit)	value = 0;
	}

	public String toString() {
		return "" + value;
	}
}
