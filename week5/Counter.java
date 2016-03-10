package week5;

public class Counter {

	int startingValue;
	boolean check;
	/*check is on if true*/
	public Counter() {
		this(0,false);
	}
	public Counter(boolean check){
		this(0,check);
	}
	public Counter(int startingValue){
		this(startingValue, checkCheck(startingValue));
	}
	public Counter(int startingValue, boolean check){
		this.startingValue = startingValue;
		this.check =check;
	}

	public int getStartingValue(){
		return this.startingValue;
	}

	public void increase(){
		this.startingValue++;
	}

	public void increase(int value){
		if(value>0)
			this.startingValue+=value;
	}

	public void decrease(int value){
		if(checkCheck(startingValue-=value))
			this.startingValue-=value;
	}

	public void decrease(){
		if(checkCheck(startingValue--))
			System.out.println();
//			this.startingValue--;
	}

	public static boolean checkCheck(int startingValue){
		if(startingValue<0)
			return false;
		else
			return true;
	}
}
